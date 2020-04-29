package com.xzsd.app.manangerOrder.controller;

import com.xzsd.app.managerInformation.controller.ManagerInformationController;
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
    private static final Logger logger = LoggerFactory.getLogger(ManangerOrderController.class);
    /**
     * 店长订单
     * @param manangerOrderInfo
     * @return
     */
    @RequestMapping("listManagerOrders")
    public AppResponse listManagerOrders(ManangerOrderInfo manangerOrderInfo){
        try {
            return manangerOrderService.listManagerOrders(manangerOrderInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 店长订单状态修改
     * @param manangerOrderInfo
     * @return
     */
    @PostMapping("updateManangerOrderState")
    public AppResponse updateManangerOrderState(ManangerOrderInfo manangerOrderInfo){
        try {
            return manangerOrderService.updateManangerOrderState(manangerOrderInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 店长订单查询
     * @param orderId
     * @return
     */
    @RequestMapping("listManagerOrderDeepen")
    public AppResponse listManagerOrderDeepen(String orderId){
        try {
            return manangerOrderService.listManagerOrderDeepen(orderId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}

