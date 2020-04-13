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

    /**
     * 新增司机
     * @param driverInfo
     * @return
     */
    @PostMapping("saveDriver")
    public AppResponse saveDriver(DriverInfo driverInfo){
        return driverService.saveDriver(driverInfo);
    }

    /**
     * 更新司机
     * @param driverInfo
     * @return
     */
    @PostMapping("updateDriver")
    public AppResponse updateDriver(DriverInfo driverInfo){
        return  driverService.updateDriver(driverInfo);
    }

    /**
     * 删除司机
     * @param driverId
     * @return
     */
    @PostMapping("deleteDriver")
    public AppResponse deleteDriver(String driverId){
        return  driverService.deleteDriver(driverId);
    }

    /**
     * 司机列表查询
     * @param driverInfo
     * @return
     */
    @RequestMapping(value = "listDriver")
    public AppResponse listDriver(DriverInfo driverInfo){
        return driverService.listDriver(driverInfo);
    }

    @RequestMapping(value = "queryDriver")
    public AppResponse queryDriver(String driverId){
        return driverService.queryDriver(driverId);
    }
}
