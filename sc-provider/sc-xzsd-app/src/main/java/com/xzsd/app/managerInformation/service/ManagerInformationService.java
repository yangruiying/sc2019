package com.xzsd.app.managerInformation.service;


import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.managerInformation.dao.ManagerInformationDao;
import com.xzsd.app.managerInformation.entity.ManagerInformationInfo;
import com.xzsd.app.util.AppResponse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerInformationService {
    @Resource
    private ManagerInformationDao managerInformationDao;

    /**
     * 查询店长门下的司机信息接口
     * @return
     */
    public AppResponse listManagerDrivers(){
        String userId = SecurityUtils.getCurrentUserId();
        List<ManagerInformationInfo> managerInformationInfo = managerInformationDao.listManagerDrivers(userId);
        return AppResponse.success("查询成功",managerInformationInfo);
    }
}
