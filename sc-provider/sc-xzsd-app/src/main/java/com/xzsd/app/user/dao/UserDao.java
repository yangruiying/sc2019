package com.xzsd.app.user.dao;


import com.xzsd.app.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @param userinfo
     * @return
     */
    int saveUser(UserInfo userinfo);


}
