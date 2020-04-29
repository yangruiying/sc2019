package com.xzsd.pc.driver.controller;

import com.neusoft.core.page.PageUtils;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.driver.entity.DriverInfo;
import com.xzsd.pc.driver.service.DriverService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/driver")
public class DriverController {
    private static final Logger logger = LoggerFactory.getLogger(DriverController.class);
    @Resource
    private DriverService driverService;

    /**
     * 新增司机
     * @param driverInfo
     * @return
     */
    @PostMapping("saveDriver")
    public AppResponse saveDriver(DriverInfo driverInfo){
        try {
            return driverService.saveDriver(driverInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新司机
     * @param driverInfo
     * @return
     */
    @PostMapping("updateDriver")
    public AppResponse updateDriver(DriverInfo driverInfo){
        try {
            return  driverService.updateDriver(driverInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除司机
     * @param driverId
     * @return
     */
    @PostMapping("deleteDriver")
    public AppResponse deleteDriver(String driverId){
        try {
            return  driverService.deleteDriver(driverId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 司机列表查询
     * @param driverInfo
     * @return
     */
    @RequestMapping(value = "listDriver")
    public AppResponse listDriver(DriverInfo driverInfo){
        try {
            return driverService.listDriver(driverInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @RequestMapping(value = "queryDriver")
    public AppResponse queryDriver(String driverId){
        try {
            return driverService.queryDriver(driverId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
