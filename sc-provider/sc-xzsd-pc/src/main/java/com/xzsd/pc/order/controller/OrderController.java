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

    /**
     * 订单列表
     * @param orderInfo
     * @return
     */
    @RequestMapping(value = "listOrder")
    public AppResponse listOrder(OrderInfo orderInfo){
        return orderService.listOrder(orderInfo);
    }

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "queryOrder")
    public AppResponse queryOrder(String orderId){
        return orderService.queryOrder(orderId);
    }

    /**
     * 更新订单
     * @param orderId
     * @param version
     * @param state
     * @return
     */
    @PostMapping("updateOrder")
    public AppResponse updateOrder(String orderId,String version,int state){
        return orderService.updateOrder(orderId,version,state);
    }
}
