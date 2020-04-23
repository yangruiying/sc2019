package com.xzsd.app.userInformation.controller;

import com.xzsd.app.userInformation.entity.UserInformationInfo;
import com.xzsd.app.userInformation.service.UserInformationService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userInformation")
public class UserInformationController {
    @Resource
    private UserInformationService userInformationService;

    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping(value = "getUser")
    public AppResponse getUser(){
        return userInformationService.getUser();
    }

    /**
     * 修改密码
     * @param userInformationInfo
     * @return
     */
    @RequestMapping(value = "updateUserPassword")
    public AppResponse updateUserPassword(UserInformationInfo userInformationInfo){
        return userInformationService.updateUserPassword(userInformationInfo);
    }
}
