package com.xzsd.app.clientOrder.controller;

import com.xzsd.app.clientOrder.service.ClientOrderService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("clientOrder")
public class ClientOrderController {
    @Resource
    private ClientOrderService clientOrderService;

    @PostMapping("addOrder")
    public AppResponse addOrder(String cId,String goodsCount,String shopId){
        return clientOrderService.addOrder(cId,goodsCount,shopId);
    }
}
