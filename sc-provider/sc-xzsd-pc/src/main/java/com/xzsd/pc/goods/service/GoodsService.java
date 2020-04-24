package com.xzsd.pc.goods.service;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.goods.dao.GoodsDao;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.sort.entity.SortInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.neusoft.core.page.PageUtils.getPageInfo;


@Service
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;


    /**
     * 商品列表
     * @param goodsInfo
     * @return
     */
    public AppResponse listGoods(GoodsInfo goodsInfo){
        List<GoodsInfo> goodsInfoList=goodsDao.listGoodsByPage(goodsInfo);
        return AppResponse.success("查询成功",getPageInfo(goodsInfoList));

    }


    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveGoods(GoodsInfo goodsInfo){
        goodsInfo.setcId(StringUtil.getCommonCode(2));
        String userId = SecurityUtils.getCurrentUserId();
        goodsInfo.setCreateBy(userId);
        int countIsbn = goodsDao.countIsbn(goodsInfo.getIsbn());
        if(countIsbn != 0){
            return AppResponse.notFound("书名重复,请重新输入");
        }
        int count = goodsDao.saveGoods(goodsInfo);
        if(count == 0){
            return AppResponse.versionError("新增失败");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 查询商品
     * @param cId
     * @return
     */
    public AppResponse queryGoods(String cId){
        GoodsInfo goodsInfo=goodsDao.queryGoods(cId);
        return AppResponse.success("查询成功",goodsInfo);
    }

    /**
     * 删除商品
     * @param cId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoods(String cId){
        List<String> codeList= Arrays.asList(cId.split(","));
        int count = goodsDao.deleteGoods(codeList);
        if (count == 0){
            return AppResponse.versionError("版本错误,删除失败");
        }
        return AppResponse.success("删除成功");
    }

    /**
     * 更新商品
     * @param goodsInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoods(GoodsInfo goodsInfo){
        GoodsInfo goods = goodsDao.queryGoods(goodsInfo.getcId());
            int countIsbn = goodsDao.countIsbn(goodsInfo.getIsbn());
            GoodsInfo info = goodsDao.queryGoods(goodsInfo.getcId());
            if (!info.getIsbn().equals(goodsInfo.getIsbn())){
                if (countIsbn != 0) {
                    return AppResponse.notFound("isbn重复,请重新输入");
                }
            }
        int count = goodsDao.updateGoods(goodsInfo);
        if (count == 0){
            return AppResponse.notFound("更新失败");
        }
        return AppResponse.success("更新成功");
    }

    /**
     * 商品分类下拉框
     * @param sortId
     * @return
     */
    public AppResponse listGoodsClassify(String sortId){
        List<SortInfo> sortList = goodsDao.listGoodsClassify(sortId);
        return AppResponse.success("查询成功",sortList);
    }

    /**
     * 商品状态修改
     * @param cId
     * @param version
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse goodsState(String cId,String version,int state){
        List<String> idList = Arrays.asList(cId.split(","));
        List<String> stateList = Arrays.asList(version.split(","));
        List<GoodsInfo> goodsStateList = new ArrayList();
        for(int i = 0 ; i < idList.size() ; i++){
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setcId(idList.get(i));
            goodsInfo.setVersion(Integer.parseInt(stateList.get(i)));
            goodsStateList.add(goodsInfo);
        }
        System.out.println();
        int count = goodsDao.goodsState(goodsStateList,state);
        if (count == 0){
            return AppResponse.versionError("版本错误,更新失败");
        }
        return AppResponse.success("更新成功");
    }

}
