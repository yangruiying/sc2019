package com.xzsd.app.userInformation.controller;

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

    @RequestMapping(value = "getUser")
    public AppResponse getUser(){
        return userInformationService.getUser();
    }
}
