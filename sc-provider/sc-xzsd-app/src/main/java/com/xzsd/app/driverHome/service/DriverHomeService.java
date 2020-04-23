package com.xzsd.app.driverHome.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.driverHome.dao.DriverHomeDao;
import com.xzsd.app.driverHome.entity.DriverHomeInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DriverHomeService {
    @Resource
    private DriverHomeDao driverHomeDao;

    public AppResponse listDriverStores(){
        String userId = SecurityUtils.getCurrentUserId();
        List<DriverHomeInfo> driverHomeInfoList = driverHomeDao.listDriverStores(userId);
        return AppResponse.success("查询成功",driverHomeInfoList);
    }
}
