package com.xzsd.pc.shop.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.shop.entity.DictionariesInfo;
import com.xzsd.pc.shop.entity.ShopInfo;
import com.xzsd.pc.shop.service.ShopService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("shop")
public class ShopController {

    @Resource
    private ShopService shopService;
    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
    /**
     * 新增门店
     * @param shopInfo
     * @return
     */
    @PostMapping("saveShop")
    public AppResponse saveShop(ShopInfo shopInfo){
        try {
            return shopService.saveShop(shopInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 省市区下拉查询
     * @return
     */
    @RequestMapping(value = "listArea")
    public AppResponse listArea(String id){
        try {
            return shopService.listArea(id);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 门店分页查询
     * @param shopInfo
     * @return
     */
    @RequestMapping(value = "listShop")
    public AppResponse listShopByPage(ShopInfo shopInfo){
        try {
            return shopService.listShopByPage(shopInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新门店
     * @param shopInfo
     * @return
     */
    @PostMapping("updateShop")
    public AppResponse updateShop(ShopInfo shopInfo){
        try {
            return shopService.updateShop(shopInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除门店
     * @param shopId
     * @return
     */
    @RequestMapping(value = "deleteShop")
    public AppResponse deleteShop(String shopId){
        try {
            return shopService.deleteShop(shopId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 门店详情
     * @param shopId
     * @return
     */
    @RequestMapping(value = "queryShop")
    public AppResponse queryShop(String shopId){
        try {
            return shopService.queryShop(shopId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
