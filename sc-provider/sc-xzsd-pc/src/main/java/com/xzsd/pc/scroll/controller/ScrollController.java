package com.xzsd.pc.scroll.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import com.xzsd.pc.scroll.service.ScrollService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/scroll")
public class ScrollController {
    @Resource
    private ScrollService scrollService;

    /**
     * 轮播图列表查询
     * @param scrollInfo
     * @return
     */
    @PostMapping("listScroll")
    public AppResponse listScroll(ScrollInfo scrollInfo){
        return scrollService.listScroll(scrollInfo);
    }

    /**
     * 删除轮播图
     * @param pId
     * @return
     */
    @PostMapping("deleteScroll")
    public AppResponse deleteScroll(String pId){
        return scrollService.deleteScroll(pId);
    }

    /**
     * 商品状态修改
     * @param scrollInfo
     * @return
     */
    @PostMapping("stateGoods")
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        return scrollService.stateGoods(scrollInfo);
    }

    /**
     * 新增轮播图
     * @param scrollInfo
     * @return
     */
    @PostMapping("saveScroll")
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        return scrollService.saveScroll(scrollInfo);
    }

    /**
     * 商品列表
     * @param goodsInfo
     * @return
     */
    @RequestMapping(value = "listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo){
        return scrollService.listGoods(goodsInfo);
    }

    /**
     * 修改轮播图状态
     * @param pId
     * @param state
     * @return
     */
    @PostMapping("stateScroll")
    public AppResponse stateScroll(String pId,String version,int state){
        return scrollService.stateScroll(pId,version,state);
    }
}
