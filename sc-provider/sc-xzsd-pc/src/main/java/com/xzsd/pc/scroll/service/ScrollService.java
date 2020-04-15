package com.xzsd.pc.scroll.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;

import com.neusoft.util.StringUtil;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.scroll.dao.ScrollDao;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        List<ScrollInfo> scrolllist=scrollDao.listScroll(scrollInfo);
        return AppResponse.success("查询成功",getPageInfo(scrolllist));
    }

    /**
     * 删除轮播图
     * @param Pid
     * @return
     */
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
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        scrollDao.stateGoods(scrollInfo);
        return AppResponse.success("修改成功");
    }

    /**
     * 新增轮播图
     * @param scrollInfo
     * @return
     */
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        scrollInfo.setpId(StringUtil.getCommonCode(2));
        scrollDao.saveScroll(scrollInfo);
        return AppResponse.success("新增成功");
    }

    /**
     * 查询商品
     * @param goodsInfo
     * @return
     */
    public AppResponse listGoods(GoodsInfo goodsInfo){
        List<GoodsInfo> goodsList = scrollDao.listGoods(goodsInfo);
        return AppResponse.success("查询成功",goodsList);
    }

    /**
     * 修改轮播图状态
     * @param pId
     * @param state
     * @return
     */
    public AppResponse stateScroll(String pId,int state){
        List<String> idList = Arrays.asList(pId.split(","));
        int count = scrollDao.stateScroll(idList,state);
        if (count == 0){
            return AppResponse.bizError("修改失败");
        }
        return AppResponse.success("修改成功");
    }


}
