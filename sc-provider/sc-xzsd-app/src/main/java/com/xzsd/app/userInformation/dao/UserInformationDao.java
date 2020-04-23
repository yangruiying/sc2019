package com.xzsd.app.userInformation.dao;

import com.xzsd.app.userInformation.entity.UserInformationInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInformationDao {
    /**
     * 获取个人信息
     * @param userId
     * @return
     */
    UserInformationInfo getUser(String userId);

    /**
     * 修改密码
     * @param userInformationInfo
     * @return
     */
    int updateUserPassword(UserInformationInfo userInformationInfo);

    /**
     * 获取用户密码
     * @param userId
     * @return
     */
    String getPassword(String userId);
}
