package com.xzsd.pc.driver.service;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.driver.dao.DriverDao;
import com.xzsd.pc.driver.entity.DriverInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DriverService {
    @Resource
    private DriverDao driverDao;

    public AppResponse saveDriver(DriverInfo driverInfo){
        driverInfo.setDriverId(StringUtil.getCommonCode(2));
        driverDao.saveUser(driverInfo);
        driverDao.saveDriver(driverInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse updateDriver(DriverInfo driverInfo){
        driverDao.updateUser(driverInfo);
        driverDao.updateDriver(driverInfo);
        return AppResponse.success("更新成功");
    }

    public AppResponse deleteDriver(String driverId){
        driverDao.deleteDriver(driverId);
        return AppResponse.success("删除成功");
    }
}
