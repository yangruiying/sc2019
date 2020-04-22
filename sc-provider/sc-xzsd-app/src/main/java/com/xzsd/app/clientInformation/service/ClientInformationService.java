package com.xzsd.app.clientInformation.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.clientInformation.dao.ClientInformationDao;
import com.xzsd.app.clientInformation.entity.ClientInformationInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ClientInformationService {
    @Resource
    private ClientInformationDao clientInformationDao;

    /**
     * 修改邀请码
     * @param clientInformationInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateClientInvite(ClientInformationInfo clientInformationInfo){
        String clientId = SecurityUtils.getCurrentUserId();
        clientInformationInfo.setClientId(clientId);
        clientInformationDao.updateClientInvite(clientInformationInfo);
        return AppResponse.success("修改成功");
    }
}
