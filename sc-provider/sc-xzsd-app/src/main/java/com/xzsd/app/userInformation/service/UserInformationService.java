package com.xzsd.app.userInformation.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.userInformation.dao.UserInformationDao;
import com.xzsd.app.userInformation.entity.UserInformationInfo;
import com.xzsd.app.util.AppResponse;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInformationService {
    @Resource
    UserInformationDao userInformationDao;

    public AppResponse getUser(){
        String userId = SecurityUtils.getCurrentUserId();
        UserInformationInfo userInformationInfo =  userInformationDao.getUser(userId);
        return AppResponse.success("查找成功",userInformationInfo);
    }
}
