package com.xzsd.app.manangerOrder.controller;

import com.xzsd.app.manangerOrder.entity.ManangerOrderInfo;
import com.xzsd.app.manangerOrder.service.ManangerOrderService;
import com.xzsd.app.user.entity.UserInfo;
import com.xzsd.app.user.service.UserService;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.AuthUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("manangerOrder")
public class ManangerOrderController {
    @Resource
    private ManangerOrderService manangerOrderService;

    /**
     * 店长订单
     * @param manangerOrderInfo
     * @return
     */
    @RequestMapping("listManagerOrders")
    public AppResponse listManagerOrders(ManangerOrderInfo manangerOrderInfo){
        return manangerOrderService.listManagerOrders(manangerOrderInfo);
    }

    /**
     * 店长订单状态修改
     * @param manangerOrderInfo
     * @return
     */
    @PostMapping("updateManangerOrderState")
    public AppResponse updateManangerOrderState(ManangerOrderInfo manangerOrderInfo){
        return manangerOrderService.updateManangerOrderState(manangerOrderInfo);
    }

    /**
     * 店长订单查询
     * @param orderId
     * @return
     */
    @RequestMapping("listManagerOrderDeepen")
    public AppResponse listManagerOrderDeepen(String orderId){
        return manangerOrderService.listManagerOrderDeepen(orderId);
    }
}

