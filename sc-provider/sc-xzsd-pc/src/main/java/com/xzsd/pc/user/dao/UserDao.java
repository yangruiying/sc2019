package com.xzsd.pc.user.dao;


import com.xzsd.pc.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @param userinfo
     * @return
     */
    int saveUser(UserInfo userinfo);
    /**
     * 查询用户
     */
    UserInfo getUserByUserCode(String userId);

    /**
     * 修改用户
     * @param userInfo
     * @return
     */
    int updateUser(UserInfo userInfo);

    /**
     * 删除用户
     * @param listCode
     * @param userName
     * @return
     */
    int deleteUser(@Param("listCode") List<String> listCode, @Param("userName") String userName);

    /**
     * 分页查询用户
     * @param userInfo
     * @return
     */
    List<UserInfo> listUsersByPage(UserInfo userInfo);

    /**
     * 查询相同账号数量
     * @param account
     * @return
     */
    int countAcc(String account);
}
