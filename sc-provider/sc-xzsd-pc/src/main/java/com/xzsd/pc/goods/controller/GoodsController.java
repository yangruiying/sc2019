package com.xzsd.pc.goods.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.goods.service.GoodsService;

import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);
    @Resource
    private GoodsService goodsService;

    /**
     * 商品列表
     * @param goodsInfo
     * @return
     */
    @RequestMapping(value = "goodsList")
    public AppResponse goodsList(GoodsInfo goodsInfo){
        try {
            return goodsService.listGoods(goodsInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */
    @PostMapping("saveGoods")
    public AppResponse saveGoods(GoodsInfo goodsInfo){
        String id = SecurityUtils.getCurrentUserId();;
        goodsInfo.setCreateBy(id);
        try {
            return goodsService.saveGoods(goodsInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品
     * @param cId
     * @return
     */
    @PostMapping("queryGoods")
    public AppResponse queryGoods(String cId){
        try {
            return goodsService.queryGoods(cId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除商品
     * @param cId
     * @return
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String cId){
        try {
            return goodsService.deleteGoods(cId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新商品
     * @param goodsInfo
     * @return
     */
    @PostMapping("updateGoods")
    public AppResponse updateGoods(GoodsInfo goodsInfo){
        try {
            return goodsService.updateGoods(goodsInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @RequestMapping(value = "listGoodsClassify")
    public AppResponse listGoodsClassify(String sortId){
        try {
            return goodsService.listGoodsClassify(sortId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新商品状态
     * @param cId
     * @param state
     * @return
     */
    @PostMapping("goodsState")
    public AppResponse goodsState(String cId,String version,int state){
        try {
            return goodsService.goodsState(cId,version,state);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
