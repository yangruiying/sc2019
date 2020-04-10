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
     * 省下拉查询
     * @return
     */
    @RequestMapping(value = "provinceList")
    public AppResponse provinceList(){
        return shopService.provinceList();
    }

    @RequestMapping(value = "cityList")
    public AppResponse cityList(DictionariesInfo dictionariesInfo){
        return shopService.cityList(dictionariesInfo);
    }

    @RequestMapping(value = "listShopByPage")
    public AppResponse listShopByPage(ShopInfo shopInfo){
        return shopService.listShopByPage(shopInfo);
    }

    @PostMapping("updateShop")
    public AppResponse updateShop(ShopInfo shopInfo){
        return shopService.updateShop(shopInfo);
    }

    @RequestMapping(value = "deleteShop")
    public AppResponse deleteShop(String shopId){
        return shopService.deleteShop(shopId);
    }

    @RequestMapping(value = "queryShop")
    public AppResponse queryShop(String shopId){
        return shopService.queryShop(shopId);
    }
}
