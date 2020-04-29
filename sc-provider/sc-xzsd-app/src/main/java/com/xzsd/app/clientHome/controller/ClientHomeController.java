package com.xzsd.app.clientHome.controller;

import com.xzsd.app.clientHome.service.ClientHomeService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("clientHome")
public class ClientHomeController {
    @Resource
    private ClientHomeService clientHomeService;
    private static final Logger logger = LoggerFactory.getLogger(ClientHomeController.class);
    /**
     * 首页轮播图
     * @return
     */
    @RequestMapping(value = "listRotationCharHome")
    public AppResponse listRotationCharHome(){
        try {
            return clientHomeService.listRotationCharHome();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 热门商品
     * @return
     */
    @RequestMapping(value = "listHotGoods")
    public AppResponse listHotGoods(){
        try {
            return clientHomeService.listHotGoods();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
