package com.xzsd.pc.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.user.dao.UserDao;
import com.xzsd.pc.user.entity.UserInfo;
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

    public AppResponse getUserByUserCode(String userId){
        UserInfo userInfo = userDao.getUserByUserCode(userId);
        return AppResponse.success("查询成功",userInfo);
    }
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUser(UserInfo userInfo){
        int count = userDao.updateUser(userInfo);
        return AppResponse.success("修改成功");
    }

    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteUser(String userId,String userName){
        List<String> listCode = Arrays.asList(userId.split(","));
        userDao.deleteUser(listCode,userName);
        return AppResponse.success("删除成功");
    }

    public AppResponse listUsers(UserInfo userInfo) {
        PageHelper.startPage(userInfo.getPageNum(), userInfo.getPageSize());
        List<UserInfo> userInfoList = userDao.listUsersByPage(userInfo);
        // 包装Page对象
        PageInfo<UserInfo> pageData = new PageInfo<UserInfo>(userInfoList);
        return AppResponse.success("查询成功！", pageData);
    }



}
