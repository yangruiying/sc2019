package com.xzsd.app.clientShopCart.controller;

import com.xzsd.app.clientShopCart.entity.ClientShopCartInfo;
import com.xzsd.app.clientShopCart.service.ClientShopCartService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(ClientShopCartController.class);
    /**
     * 新增购物车
     * @param clientShopCartInfo
     * @return
     */
    @PostMapping("addShoppingCart")
    public AppResponse addShoppingCart(ClientShopCartInfo clientShopCartInfo){
        try {
            return clientShopCartService.addShoppingCart(clientShopCartInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 购物车列表
     * @return
     */
    @PostMapping("listShoppingCarts")
    public AppResponse listShoppingCarts(){
        try {
            return clientShopCartService.listShoppingCarts();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新购物粗
     * @param clientShopCartInfo
     * @return
     */
    @PostMapping("updateShoppingCart")
    public AppResponse updateShoppingCart(ClientShopCartInfo clientShopCartInfo){
        try {
            return clientShopCartService.updateShoppingCart(clientShopCartInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    @PostMapping("deleteShoppingCart")
    public AppResponse deleteShoppingCart(String cartId){
        try {
            return clientShopCartService.deleteShoppingCart(cartId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
