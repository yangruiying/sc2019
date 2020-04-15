package com.xzsd.pc.shop.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.shop.entity.DictionariesInfo;
import com.xzsd.pc.shop.entity.ShopInfo;
import com.xzsd.pc.shop.service.ShopService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("shop")
public class ShopController {

    @Resource
    private ShopService shopService;

    /**
     * 新增门店
     * @param shopInfo
     * @return
     */
    @PostMapping("saveShop")
    public AppResponse saveShop(ShopInfo shopInfo){
        return shopService.saveShop(shopInfo);
    }

    /**
     * 省市区下拉查询
     * @return
     */
    @RequestMapping(value = "listArea")
    public AppResponse listArea(String id){
        return shopService.listArea(id);
    }

    /**
     * 门店分页查询
     * @param shopInfo
     * @return
     */
    @RequestMapping(value = "listShopByPage")
    public AppResponse listShopByPage(ShopInfo shopInfo){
        return shopService.listShopByPage(shopInfo);
    }

    /**
     * 更新门店
     * @param shopInfo
     * @return
     */
    @PostMapping("updateShop")
    public AppResponse updateShop(ShopInfo shopInfo){
        return shopService.updateShop(shopInfo);
    }

    /**
     * 删除门店
     * @param shopId
     * @return
     */
    @RequestMapping(value = "deleteShop")
    public AppResponse deleteShop(String shopId){
        return shopService.deleteShop(shopId);
    }

    /**
     * 门店详情
     * @param shopId
     * @return
     */
    @RequestMapping(value = "queryShop")
    public AppResponse queryShop(String shopId){
        return shopService.queryShop(shopId);
    }
}
