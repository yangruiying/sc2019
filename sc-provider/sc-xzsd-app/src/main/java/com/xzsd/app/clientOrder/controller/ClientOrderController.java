package com.xzsd.app.clientOrder.controller;

import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
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

    /**
     * 新增订单
     * @param cId
     * @param goodsCount
     * @param shopId
     * @return
     */
    @PostMapping("addOrder")
    public AppResponse addOrder(String cId,String goodsCount,String shopId){
        return clientOrderService.addOrder(cId,goodsCount,shopId);
    }

    /**
     * 订单列表
     * @param clientOrderInfo
     * @return
     */
    @RequestMapping(value = "listOrder")
    public AppResponse listOrder(ClientOrderInfo clientOrderInfo){
        return clientOrderService.listOrder(clientOrderInfo);
    }

    /**
     * 订单状态修改
     * @param clientOrderInfo
     * @return
     */
    @PostMapping("updateOrderState")
    public AppResponse updateOrderState(ClientOrderInfo clientOrderInfo){
        return clientOrderService.updateOrderState(clientOrderInfo);
    }

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "listOrderDeepen")
    public AppResponse listOrderDeepen(String orderId){
        return clientOrderService.listOrderDeepen(orderId);
    }

    /**
     * 查询订单评价商品信息列表接口
     * @param orderId
     * @return
     */
    @RequestMapping(value = "listGoodsForEvaluate")
    public AppResponse listGoodsForEvaluate(String orderId){
        return clientOrderService.listGoodsForEvaluate(orderId);
    }

    @PostMapping("addGoodsEvaluate")
    public AppResponse addGoodsEvaluate(ClientOrderInfo clientOrderInfo,String orderId){
        return clientOrderService.addGoodsEvaluate(clientOrderInfo,orderId);
    }
}
