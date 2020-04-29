package com.xzsd.app.clientInformation.controller;

import com.xzsd.app.clientInformation.entity.ClientInformationInfo;
import com.xzsd.app.clientInformation.service.ClientInformationService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("clientInformation")
public class ClientInformationController {
    @Resource
    private ClientInformationService clientInformationService;
    private static final Logger logger = LoggerFactory.getLogger(ClientInformationController.class);
    /**
     * 更新邀请码
     * @param clientInformationInfo
     * @return
     */
    @PostMapping("updateClientInvite")
    public AppResponse updateClientInvite(ClientInformationInfo clientInformationInfo){
        try {
            return clientInformationService.updateClientInvite(clientInformationInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
