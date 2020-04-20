package com.xzsd.app.register.dao;

import com.xzsd.app.register.entity.RegisterInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterDao {
    /**
     * 用户注册
     * @param registerInfo
     * @return
     */
    int clientRegister(RegisterInfo registerInfo);

    /**
     * 检查账号重复
     * @param account
     * @return
     */
    int countAcc(String account);
}
