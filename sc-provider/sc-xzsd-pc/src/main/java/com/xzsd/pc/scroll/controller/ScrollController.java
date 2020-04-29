package com.xzsd.pc.scroll.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import com.xzsd.pc.scroll.service.ScrollService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/scroll")
public class ScrollController {
    private static final Logger logger = LoggerFactory.getLogger(ScrollController.class);
    @Resource
    private ScrollService scrollService;

    /**
     * 轮播图列表查询
     * @param scrollInfo
     * @return
     */
    @PostMapping("listScroll")
    public AppResponse listScroll(ScrollInfo scrollInfo){
        try {
            return scrollService.listScroll(scrollInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }

    }
    /**
     * 删除轮播图
     * @param pId
     * @return
     */
    @PostMapping("deleteScroll")
    public AppResponse deleteScroll(String pId){
        try {
            return scrollService.deleteScroll(pId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 商品状态修改
     * @param scrollInfo
     * @return
     */
    @PostMapping("stateGoods")
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        try {
            return scrollService.stateGoods(scrollInfo);
        }catch (Exception e) {
            logger.error("修改错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增轮播图
     * @param scrollInfo
     * @return
     */
    @PostMapping("saveScroll")
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        try {
            return scrollService.saveScroll(scrollInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 商品列表
     * @param goodsInfo
     * @return
     */
    @RequestMapping(value = "listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo){
        try {
            return scrollService.listGoods(goodsInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改轮播图状态
     * @param pId
     * @param state
     * @return
     */
    @PostMapping("stateScroll")
    public AppResponse stateScroll(String pId,String version,int state){
        try {
            return scrollService.stateScroll(pId,version,state);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
