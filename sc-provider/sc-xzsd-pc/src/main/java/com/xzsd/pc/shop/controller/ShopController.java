package com.xzsd.pc.shop.controller;

import com.neusoft.core.restful.AppResponse;
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
    @PostMapping("saveShop")
    public AppResponse saveShop(ShopInfo shopInfo){
        return shopService.saveShop(shopInfo);
    }
}
