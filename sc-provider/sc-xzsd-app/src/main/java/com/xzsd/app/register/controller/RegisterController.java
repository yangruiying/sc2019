package com.xzsd.app.register.controller;

import com.xzsd.app.register.entity.RegisterInfo;
import com.xzsd.app.register.service.RegisterService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Resource
    private RegisterService registerService;

    /**
     * 用户注册
     * @param registerInfo
     * @return
     */
    @PostMapping("clientRegister")
    public AppResponse clientRegister(RegisterInfo registerInfo){
        return registerService.clientRegister(registerInfo);
    }
}
