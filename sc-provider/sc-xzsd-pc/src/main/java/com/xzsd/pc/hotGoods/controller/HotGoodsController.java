package com.xzsd.pc.hotGoods.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.hotGoods.entity.HotGoodsInfo;
import com.xzsd.pc.hotGoods.service.HotGoodsService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("hotGoods")
public class HotGoodsController {
    private static final Logger logger = LoggerFactory.getLogger(HotGoodsController.class);
    @Resource
    private HotGoodsService hotGoodsService;

    /**
     * 新增热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("saveHotGoods")
    public AppResponse saveHotGoods(HotGoodsInfo hotGoodsInfo){
        try {
            return hotGoodsService.saveHotGoods(hotGoodsInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("updateHotGoods")
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo){
        try {
            return hotGoodsService.updateHotGoods(hotGoodsInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除热门商品
     * @param hId
     * @return
     */
    @PostMapping("deleteHotGoods")
    public AppResponse deleteHotGoods(String hId){
        try {
            return hotGoodsService.deleteHotGoods(hId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 热门商品列表
     * @param hotGoodsInfo
     * @return
     */
    @RequestMapping(value = "listGoods")
    public AppResponse listGoods(HotGoodsInfo hotGoodsInfo){
        try {
            return hotGoodsService.listGoods(hotGoodsInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新展示数量
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("updateShowNum")
    public AppResponse updateShowNum(HotGoodsInfo hotGoodsInfo){
        try {
            return hotGoodsService.updateShowNum(hotGoodsInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查找展示数量
     * @return
     */
    @RequestMapping(value = "getShowNum")
    public AppResponse getShowNum(){
        try {
            return hotGoodsService.getShowNum();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 热门商品详情
     * @param hId
     * @return
     */
    @RequestMapping(value = "queryHotGoods")
    public AppResponse queryHotGoods(String hId){
        try {
            return hotGoodsService.queryHotGoods(hId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

}
