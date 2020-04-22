package com.xzsd.app.clientInformation.dao;

import com.xzsd.app.clientInformation.entity.ClientInformationInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClientInformationDao {
    /**
     * 修改邀请码
     * @param clientInformationInfo
     * @return
     */
    int updateClientInvite(ClientInformationInfo clientInformationInfo);
}
