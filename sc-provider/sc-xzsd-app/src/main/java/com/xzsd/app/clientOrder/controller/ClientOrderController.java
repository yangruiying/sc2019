package com.xzsd.app.clientOrder.controller;

import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
import com.xzsd.app.clientOrder.service.ClientOrderService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("clientOrder")
public class ClientOrderController {
    @Resource
    private ClientOrderService clientOrderService;
    private static final Logger logger = LoggerFactory.getLogger(ClientOrderController.class);
    /**
     * 新增订单
     * @param cId
     * @param goodsCount
     * @param shopId
     * @return
     */
    @PostMapping("addOrder")
    public AppResponse addOrder(String cId,String goodsCount,String shopId){
        try {
            return clientOrderService.addOrder(cId,goodsCount,shopId);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 订单列表
     * @param clientOrderInfo
     * @return
     */
    @RequestMapping(value = "listOrder")
    public AppResponse listOrder(ClientOrderInfo clientOrderInfo){
        try {
            return clientOrderService.listOrder(clientOrderInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 订单状态修改
     * @param clientOrderInfo
     * @return
     */
    @PostMapping("updateOrderState")
    public AppResponse updateOrderState(ClientOrderInfo clientOrderInfo){
        try {
            return clientOrderService.updateOrderState(clientOrderInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "listOrderDeepen")
    public AppResponse listOrderDeepen(String orderId){
        try {
            return clientOrderService.listOrderDeepen(orderId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询订单评价商品信息列表接口
     * @param orderId
     * @return
     */
    @RequestMapping(value = "listGoodsForEvaluate")
    public AppResponse listGoodsForEvaluate(String orderId){
        try {
            return clientOrderService.listGoodsForEvaluate(orderId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @PostMapping("addGoodsEvaluate")
    public AppResponse addGoodsEvaluate(ClientOrderInfo clientOrderInfo,String orderId){
        try {
            return clientOrderService.addGoodsEvaluate(clientOrderInfo,orderId);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
