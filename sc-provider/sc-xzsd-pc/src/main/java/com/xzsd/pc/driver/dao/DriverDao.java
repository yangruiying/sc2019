package com.xzsd.pc.driver.dao;

import com.xzsd.pc.driver.entity.DriverInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DriverDao {
    int saveDriver(DriverInfo driverInfo);
    int saveUser(DriverInfo driverInfo);
    int updateDriver(DriverInfo driverInfo);
    int updateUser(DriverInfo driverInfo);
    int deleteDriver(String driverId);
    List<DriverInfo> listDriverByPage(DriverInfo driverInfo);
    DriverInfo queryDriver(String driverId);
}
