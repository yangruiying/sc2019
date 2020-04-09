package com.xzsd.app.user.service;

import com.github.pagehelper.PageHelper;

import com.xzsd.app.user.dao.UserDao;
import com.xzsd.app.user.entity.UserInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    /**
     * 新增用户
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveUser(UserInfo userInfo){
        //int countUserAcct =userDao.saveUser(userInfo);
//        if(0 != countUserAcct) {
//            return AppResponse.bizError("用户账号已存在，请重新输入！");
//        }
        //userInfo.setUserCode(StringUtil.getCommonCode(2));
        userInfo.setIsDeleted(0);
        // 新增用户
        int count = userDao.saveUser(userInfo);
        if(0 == count) {
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }



}
