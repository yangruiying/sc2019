package com.xzsd.app.driverHome.controller;

import com.xzsd.app.driverHome.service.DriverHomeService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("driverHome")
public class DriverHomeController {
    @Resource
    private DriverHomeService driverHomeService;

    @RequestMapping(value = "listDriverStores")
    public AppResponse driverHome(){
        return driverHomeService.listDriverStores();
    }
}
