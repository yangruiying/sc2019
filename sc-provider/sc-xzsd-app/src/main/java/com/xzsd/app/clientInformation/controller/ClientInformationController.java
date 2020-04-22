package com.xzsd.app.clientInformation.controller;

import com.xzsd.app.clientInformation.entity.ClientInformationInfo;
import com.xzsd.app.clientInformation.service.ClientInformationService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("clientInformation")
public class ClientInformationController {
    @Resource
    private ClientInformationService clientInformationService;

    /**
     * 更新邀请码
     * @param clientInformationInfo
     * @return
     */
    @PostMapping("updateClientInvite")
    public AppResponse updateClientInvite(ClientInformationInfo clientInformationInfo){
        return clientInformationService.updateClientInvite(clientInformationInfo);
    }
}
