package com.xzsd.pc.order.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.order.entity.OrderInfo;
import com.xzsd.pc.order.service.OrderService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Resource
    private OrderService orderService;

    /**
     * 订单列表
     * @param orderInfo
     * @return
     */
    @RequestMapping(value = "listOrder")
    public AppResponse listOrder(OrderInfo orderInfo){
        try {
            return orderService.listOrder(orderInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "queryOrder")
    public AppResponse queryOrder(String orderId){
        try {
            return orderService.queryOrder(orderId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
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
        try {
            return orderService.updateOrder(orderId,version,state);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
