package com.xzsd.pc.driver.controller;

import com.neusoft.core.page.PageUtils;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.driver.entity.DriverInfo;
import com.xzsd.pc.driver.service.DriverService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Resource
    private DriverService driverService;

    @PostMapping("saveDriver")
    public AppResponse saveDriver(DriverInfo driverInfo){
        return driverService.saveDriver(driverInfo);
    }

    @PostMapping("updateDriver")
    public AppResponse updateDriver(DriverInfo driverInfo){
        return  driverService.updateDriver(driverInfo);
    }

    @PostMapping("deleteDriver")
    public AppResponse deleteDriver(String driverId){
        return  driverService.deleteDriver(driverId);
    }
}
