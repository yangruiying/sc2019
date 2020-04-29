package com.xzsd.app.userInformation.controller;

import com.xzsd.app.userInformation.entity.UserInformationInfo;
import com.xzsd.app.userInformation.service.UserInformationService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userInformation")
public class UserInformationController {
    @Resource
    private UserInformationService userInformationService;
    private static final Logger logger = LoggerFactory.getLogger(UserInformationController.class);
    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping(value = "getUser")
    public AppResponse getUser(){
        try {
            return userInformationService.getUser();
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改密码
     * @param userInformationInfo
     * @return
     */
    @RequestMapping(value = "updateUserPassword")
    public AppResponse updateUserPassword(UserInformationInfo userInformationInfo){
        try {
            return userInformationService.updateUserPassword(userInformationInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
