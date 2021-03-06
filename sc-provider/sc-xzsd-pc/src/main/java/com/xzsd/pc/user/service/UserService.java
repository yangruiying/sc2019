package com.xzsd.pc.user.service;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.PasswordUtils;
import com.xzsd.pc.user.dao.UserDao;

import com.xzsd.pc.user.entity.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;


@Service
public class UserService {
    @Resource
    private UserDao userDao;
    /**
     * 新增用户
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveUser(UserInfo userInfo){
        String createBy = SecurityUtils.getCurrentUserId();
        userInfo.setCreateBy(createBy);
        int countAcc = userDao.countAcc(userInfo.getAccount());
        //判断账号重复
        if(countAcc != 0){
            return AppResponse.notFound("账号已存在，请重新输入");
        }
        userInfo.setUserId(StringUtil.getCommonCode(2));
        //密码加密
        String pwd = PasswordUtils.generatePassword(userInfo.getUserPassword());
        userInfo.setUserPassword(pwd);
        // 新增用户
        int count = userDao.saveUser(userInfo);
        if(0 == count) {
            return AppResponse.versionError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 用户查询
     * @param userId
     * @return
     */
    public AppResponse getUserByUserCode(String userId){
        UserInfo userInfo = userDao.getUserByUserCode(userId);
        return AppResponse.success("查询成功",userInfo);
    }

    /**
     * 更新用户
     * @param userInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUser(UserInfo userInfo){
        String userId = SecurityUtils.getCurrentUserId();
        userInfo.setCreateBy(userId);
        UserInfo info = userDao.getUserByUserCode(userInfo.getUserId());
        if (!info.getAccount().equals(userInfo.getAccount())){
            int countAcc = userDao.countAcc(userInfo.getAccount());
            //判断账号重复
            if(countAcc != 0){
                return AppResponse.notFound("账号已存在，请重新输入");
            }
        }
        int count = userDao.updateUser(userInfo);
        if(count==0){
            return AppResponse.versionError("版本错误 修改失败");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 删除用户
     * @param userId
     * @param userName
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteUser(String userId,String userName){
        List<String> listCode = Arrays.asList(userId.split(","));
        int count = userDao.deleteUser(listCode,userName);
        if(count == 0){
            return AppResponse.versionError("版本错误,删除失败");
        }
        return AppResponse.success("删除成功");
    }

    /**
     * 用户列表
     * @param userInfo
     * @return
     */
    public AppResponse listUsers(UserInfo userInfo) {
        List<UserInfo> userInfoList = userDao.listUsersByPage(userInfo);
        return AppResponse.success("查询成功！", getPageInfo(userInfoList));
    }



}
