package com.xzsd.app.clientShopCart.controller;

import com.xzsd.app.clientShopCart.entity.ClientShopCartInfo;
import com.xzsd.app.clientShopCart.service.ClientShopCartService;
import com.xzsd.app.util.AppResponse;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/clientShopCart")
public class ClientShopCartController {
    @Resource
    private ClientShopCartService clientShopCartService;

    /**
     * 新增购物车
     * @param clientShopCartInfo
     * @return
     */
    @PostMapping("addShoppingCart")
    public AppResponse addShoppingCart(ClientShopCartInfo clientShopCartInfo){
        return clientShopCartService.addShoppingCart(clientShopCartInfo);
    }

    /**
     * 购物车列表
     * @return
     */
    @PostMapping("listShoppingCarts")
    public AppResponse listShoppingCarts(){
        return clientShopCartService.listShoppingCarts();
    }

    /**
     * 更新购物粗
     * @param clientShopCartInfo
     * @return
     */
    @PostMapping("updateShoppingCart")
    public AppResponse updateShoppingCart(ClientShopCartInfo clientShopCartInfo){
        return clientShopCartService.updateShoppingCart(clientShopCartInfo);
    }
    @PostMapping("deleteShoppingCart")
    public AppResponse deleteShoppingCart(String cartId){
        return clientShopCartService.deleteShoppingCart(cartId);
    }
}
