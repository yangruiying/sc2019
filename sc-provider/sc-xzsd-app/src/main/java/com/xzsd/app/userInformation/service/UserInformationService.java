package com.xzsd.app.userInformation.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.PasswordUtils;
import com.xzsd.app.userInformation.dao.UserInformationDao;
import com.xzsd.app.userInformation.entity.UserInformationInfo;
import com.xzsd.app.util.AppResponse;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserInformationService {
    @Resource
    UserInformationDao userInformationDao;

    /**
     * 查询个人信息
     * @return
     */
    public AppResponse getUser(){
        String userId = SecurityUtils.getCurrentUserId();
        UserInformationInfo userInformationInfo =  userInformationDao.getUser(userId);
        return AppResponse.success("查找成功",userInformationInfo);
    }

    /**
     * 修改密码
     * @param userInformationInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUserPassword(UserInformationInfo userInformationInfo){
        String oldPassword = userInformationInfo.getOldPassword();
        String userId = SecurityUtils.getCurrentUserId();
        String password = userInformationDao.getPassword(userId);
        userInformationInfo.setUserId(userId);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean same = bCryptPasswordEncoder.matches(oldPassword,password);
        if (!same){
            return AppResponse.notFound("原密码错误");
        }
        String pwd = PasswordUtils.generatePassword(userInformationInfo.getNewPassword());
        userInformationInfo.setNewPassword(pwd);
        int count = userInformationDao.updateUserPassword(userInformationInfo);
        if (count == 0){
            return AppResponse.versionError("版本错误,修改失败");
        }
        return AppResponse.success("修改成功");
    }
}
