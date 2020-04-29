package com.xzsd.app.driverHome.controller;

import com.xzsd.app.driverHome.service.DriverHomeService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("driverHome")
public class DriverHomeController {
    @Resource
    private DriverHomeService driverHomeService;
    private static final Logger logger = LoggerFactory.getLogger(DriverHomeController.class);
    @RequestMapping(value = "listDriverStores")
    public AppResponse driverHome(){
        try {
            return driverHomeService.listDriverStores();
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
