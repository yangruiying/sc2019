package com.xzsd.pc.driver.service;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.driver.dao.DriverDao;
import com.xzsd.pc.driver.entity.DriverInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class DriverService {
    @Resource
    private DriverDao driverDao;

    /**
     * 新增司机
     * @param driverInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveDriver(DriverInfo driverInfo){
        driverInfo.setDriverId(StringUtil.getCommonCode(2));
        driverDao.saveUser(driverInfo);
        driverDao.saveDriver(driverInfo);
        return AppResponse.success("新增成功");
    }

    /**
     * 更新司机
     * @param driverInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateDriver(DriverInfo driverInfo){
        driverDao.updateUser(driverInfo);
        driverDao.updateDriver(driverInfo);
        return AppResponse.success("更新成功");
    }

    /**
     * 删除司机
     * @param driverId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteDriver(String driverId){
        driverDao.deleteDriver(driverId);
        return AppResponse.success("删除成功");
    }

    /**
     * 司机列表查询
     * @param driverInfo
     * @return
     */
    public AppResponse listDriver(DriverInfo driverInfo){
        List<DriverInfo> driverInfoList=driverDao.listDriver(driverInfo);
        return AppResponse.success("查询成功",getPageInfo(driverInfoList));
    }

    public AppResponse queryDriver(String driverId){
        DriverInfo driverInfo = driverDao.queryDriver(driverId);
        return AppResponse.success("查询成功",driverInfo);
    }
}
