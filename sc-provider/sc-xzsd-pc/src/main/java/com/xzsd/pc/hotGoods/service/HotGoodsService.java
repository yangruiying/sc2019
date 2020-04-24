package com.xzsd.pc.hotGoods.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
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
        String userId = SecurityUtils.getCurrentUserId();
        hotGoodsInfo.setCreateBy(userId);
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
        String userId = SecurityUtils.getCurrentUserId();
        hotGoodsInfo.setCreateBy(userId);
        int count = hotGoodsDao.updateHotGoods((hotGoodsInfo));
        if (count == 0){
            return AppResponse.versionError("版本错误,修改失败");
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
            return AppResponse.versionError("版本错误,删除失败");

        }        return AppResponse.success("删除成功");
    }

    /**
     * 热门商品列表
     * @param hotGoodsInfo
     * @return
     */
    public AppResponse listGoods(HotGoodsInfo hotGoodsInfo){
        List<HotGoodsInfo> hotGoodsList=hotGoodsDao.listGoodsByPage(hotGoodsInfo);
        return AppResponse.success("查询成功",getPageInfo(hotGoodsList));
    }

    /**
     * 更新展示数量
     * @param hotGoodsInfo
     * @return
     */
    public AppResponse updateShowNum(HotGoodsInfo hotGoodsInfo){
        int count = hotGoodsDao.updateShowNum(hotGoodsInfo);
        if (count == 0){
            return AppResponse.versionError("版本错误,更新失败");
        }
        return AppResponse.success("更新成功");
    }

    /**
     * 查找展示数量
     * @return
     */
    public AppResponse getShowNum(){
        HotGoodsInfo count = hotGoodsDao.getShowNum();
        return AppResponse.success("查找成功",count);
    }

    /**
     * 热门商品详情
     * @param hId
     * @return
     */
    public AppResponse queryHotGoods(String hId){
        HotGoodsInfo hotGoodsInfo= hotGoodsDao.queryHotGoods(hId);
        return AppResponse.success("查找成功",hotGoodsInfo);
    }
}
