package com.xzsd.app.driverHome.dao;

import com.xzsd.app.driverHome.entity.DriverHomeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DriverHomeDao {
    /**
     * 查询负责的门店
     * @param userId
     * @return
     */
    List<DriverHomeInfo> listDriverStores(String userId);
}
