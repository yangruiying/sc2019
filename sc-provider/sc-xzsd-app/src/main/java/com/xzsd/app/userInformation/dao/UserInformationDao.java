package com.xzsd.app.userInformation.dao;

import com.xzsd.app.userInformation.entity.UserInformationInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInformationDao {
    UserInformationInfo getUser(String userId);
}
