package com.xzsd.pc.scroll.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;

import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.order.entity.OrderInfo;
import com.xzsd.pc.scroll.dao.ScrollDao;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class ScrollService {
    @Resource
    private ScrollDao scrollDao;

    /**
     * 轮播图列表
     * @param scrollInfo
     * @return
     */
    public AppResponse listScroll(ScrollInfo scrollInfo){
        List<ScrollInfo> scrolllist=scrollDao.listScrollByPage(scrollInfo);
        return AppResponse.success("查询成功",getPageInfo(scrolllist));
    }

    /**
     * 删除轮播图
     * @param Pid
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteScroll(String Pid){
        List<String> scrollList = Arrays.asList(Pid.split(","));
        scrollDao.deleteScroll(scrollList);
        return AppResponse.success("删除成功");
    }

    /**
     * 商品状态修改
     * @param scrollInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        scrollDao.stateGoods(scrollInfo);
        return AppResponse.success("修改成功");
    }

    /**
     * 新增轮播图
     * @param scrollInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        String userId = SecurityUtils.getCurrentUserId();
        scrollInfo.setCreateBy(userId);
        scrollInfo.setpId(StringUtil.getCommonCode(2));
        int goodsCount = scrollDao.countGoods(scrollInfo.getcId());
        if (goodsCount != 0){
            return AppResponse.notFound("商品重复，新增失败");
        }
        int count = scrollDao.saveScroll(scrollInfo);
        if (count == 0){
            return AppResponse.versionError("新增失败");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 查询商品
     * @param goodsInfo
     * @return
     */
    public AppResponse listGoods(GoodsInfo goodsInfo){
        List<GoodsInfo> goodsList = scrollDao.listGoodsByPage(goodsInfo);
        return AppResponse.success("查询成功",getPageInfo(goodsList));
    }

    /**
     * 修改轮播图状态
     * @param pId
     * @param state
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateScroll(String pId,String version,int state){
        List<String> idList = Arrays.asList(pId.split(","));
        List<String> stateList = Arrays.asList(version.split(","));
        List<ScrollInfo> scrollStateList = new ArrayList();
        for(int i = 0 ; i < idList.size() ; i++){
            ScrollInfo scrollInfo = new ScrollInfo();
            scrollInfo.setpId(idList.get(i));
            scrollInfo.setVersion(stateList.get(i));
            scrollStateList.add(scrollInfo);
        }
        String createBy = SecurityUtils.getCurrentUserId();
        int count = scrollDao.stateScroll(scrollStateList,state,createBy);
        if (count == 0){
            return AppResponse.versionError("版本错误,修改失败");
        }
        return AppResponse.success("修改成功");
    }


}
