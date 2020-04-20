package com.xzsd.app.register.service;

import com.xzsd.app.PasswordUtils;
import com.xzsd.app.register.dao.RegisterDao;
import com.xzsd.app.register.entity.RegisterInfo;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class RegisterService {
    @Resource
    private RegisterDao registerDao;

    @Transactional(rollbackFor = Exception.class)
    public AppResponse clientRegister(RegisterInfo registerInfo){
        registerInfo.setClientId(StringUtil.getCommonCode(2));
        registerInfo.setPassword(PasswordUtils.generatePassword(registerInfo.getPassword()));
        int countAcc = registerDao.countAcc(registerInfo.getAccount());
        if (countAcc != 0){
            return AppResponse.notFound("账号已存在");
        }
        int count = registerDao.clientRegister(registerInfo);
        if (count == 0){
            return AppResponse.versionError("注册失败");
        }
        return AppResponse.success("注册成功");
    }
}
