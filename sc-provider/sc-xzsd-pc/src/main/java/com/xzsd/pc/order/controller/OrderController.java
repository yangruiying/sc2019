package com.xzsd.pc.order.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.order.entity.OrderInfo;
import com.xzsd.pc.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping(value = "listOrder")
    public AppResponse listOrder(OrderInfo orderInfo){
        return orderService.listOrder(orderInfo);
    }

    @RequestMapping(value = "queryOrder")
    public AppResponse queryOrder(String orderId){
        return orderService.queryOrder(orderId);
    }

    @PostMapping("updateOrder")
    public AppResponse updateOrder(OrderInfo orderInfo){
        return orderService.updateOrde(orderInfo);
    }
}
