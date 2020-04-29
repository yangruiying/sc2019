package com.xzsd.app.register.controller;

import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.register.entity.RegisterInfo;
import com.xzsd.app.register.service.RegisterService;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Resource
    private RegisterService registerService;
    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
    /**
     * 用户注册
     * @param registerInfo
     * @return
     */
    @PostMapping("clientRegister")
    public AppResponse clientRegister(RegisterInfo registerInfo){
        try {
            return registerService.clientRegister(registerInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
