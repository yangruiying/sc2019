package com.xzsd.app.managerInformation.controller;

import com.xzsd.app.managerInformation.service.ManagerInformationService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("managerInformation")
public class ManagerInformationController {
    @Resource
    private ManagerInformationService managerInformationService;

    /**
     * 查询店长门下的司机信息接口
     * @return
     */
    @RequestMapping(value = "listManagerDrivers")
    public AppResponse listManagerDrivers(){
        return managerInformationService.listManagerDrivers();
    }
}
