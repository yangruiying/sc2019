package com.xzsd.pc.hotGoods.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.hotGoods.dao.HotGoodsDao;
import com.xzsd.pc.hotGoods.entity.HotGoodsInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class HotGoodsService {
    @Resource
    private HotGoodsDao hotGoodsDao;

    /**
     * 新增热门商品
     * @param hotGoodsInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveHotGoods(HotGoodsInfo hotGoodsInfo){
        int countHotGoods = hotGoodsDao.countHotGoods(hotGoodsInfo);
        if (0 != countHotGoods)
        {
            return AppResponse.success("编号已存在");
        }
        hotGoodsInfo.sethId(StringUtil.getCommonCode(2));
        int count=hotGoodsDao.saveHotGoods(hotGoodsInfo);
        if (0 == count)
        {
            return AppResponse.success("新增失败，请重试！");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 更新热门商品
     * @param hotGoodsInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo){
        int count = hotGoodsDao.updateHotGoods((hotGoodsInfo));
        if (count == 0){
            return AppResponse.bizError("修改失败");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 删除热门商品
     * @param hId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteHotGoods(String hId){
        List<String> hotGoodsList = Arrays.asList(hId.split(","));
        int count = hotGoodsDao.deleteHotGoods(hotGoodsList);
        if (count == 0){
            return AppResponse.bizError("删除失败");

        }        return AppResponse.success("删除成功");
    }

    /**
     * 热门商品列表
     * @param hotGoodsInfo
     * @return
     */
    public AppResponse listGoods(HotGoodsInfo hotGoodsInfo){
        HotGoodsInfo hotGoodsList=hotGoodsDao.listGoodsByPage(hotGoodsInfo);
        return AppResponse.success("查询成功",getPageInfo(hotGoodsList));
    }
}
