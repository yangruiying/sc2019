package com.xzsd.app.managerInformation.controller;

import com.xzsd.app.managerInformation.service.ManagerInformationService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("managerInformation")
public class ManagerInformationController {
    @Resource
    private ManagerInformationService managerInformationService;
    private static final Logger logger = LoggerFactory.getLogger(ManagerInformationController.class);
    /**
     * 查询店长门下的司机信息接口
     * @return
     */
    @RequestMapping(value = "listManagerDrivers")
    public AppResponse listManagerDrivers(){
        try {
            return managerInformationService.listManagerDrivers();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
