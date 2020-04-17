package com.xzsd.pc.user.controller;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.AuthUtils;
import com.xzsd.pc.user.entity.UserInfo;
import com.xzsd.pc.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    /**
     * 新增用户
     */
    @PostMapping("saveUser")
    public AppResponse saveUser(UserInfo userInfo){
        try {
            //获取用户id
            String userId = SecurityUtils.getCurrentUserId();
            userInfo.setCreateBy(userId);
            AppResponse appResponse = userService.saveUser(userInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("用户新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    @RequestMapping(value = "getUserByUserCode")
    public AppResponse getUserByUserCode(String userId){
        try {
            return userService.getUserByUserCode(userId);
        }catch (Exception e) {
            logger.error("用户查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新用户信息
     * @param userInfo
     * @return
     */
    @PostMapping("updateUser")
    public AppResponse updateUser(UserInfo userInfo){
        return userService.updateUser(userInfo);
    }

    /**
     * 删除用户
     * @param userId
     * @param userName
     * @return
     */
    @PostMapping("deleteUser")
    public AppResponse delete(String userId,String userName){
        return userService.deleteUser(userId,userName);
    }



    @RequestMapping(value = "listUsers")
    public AppResponse listUsers(UserInfo userInfo) {
        try {
            return userService.listUsers(userInfo);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
