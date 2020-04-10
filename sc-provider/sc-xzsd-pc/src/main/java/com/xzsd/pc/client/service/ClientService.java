package com.xzsd.pc.client.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;

import com.xzsd.pc.client.dao.ClientDao;
import com.xzsd.pc.client.entity.ClientInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientService {
    @Resource
    private ClientDao clientDao;

//    @Resource
//    RedisOperator redis;

    /**
     * demo 新增客户
     * @param clientInfo
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveUser(ClientInfo clientInfo) {
        // 校验账号是否存在
//        int countUserAcct = clientDao.countUserAcct(clientInfo);
//        if(0 != countUserAcct) {
//            return AppResponse.bizError("用户账号已存在，请重新输入！");
//        }
        //userInfo.setUserCode(StringUtil.getCommonCode(2));
        //userInfo.setIsDeleted(0);
        // 新增用户
        int count = clientDao.saveClient(clientInfo);
        if(0 == count) {
            return AppResponse.success("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * 查询客户
     * @param client_id
     * @return
     */
    public AppResponse getClientByUserCode(String client_id) {
        ClientInfo ClientInfo = clientDao.getClientByUserCode(client_id);
        return AppResponse.success("查询成功！",ClientInfo);
    }

    /**
     * 删除客户
     * @param client_id
     * @return
     */
    public AppResponse deleteClient(String client_id){
        List<String> ListCode = Arrays.asList(client_id.split(","));
        int count = clientDao.deleteClient(ListCode);
        AppResponse appResponse = AppResponse.success("删除成功");
        return appResponse;
    }

    /**
     * 更新客户
     * @param clientInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateClient(ClientInfo clientInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 校验账号是否存在
        //int countUserAcct = clientDao.countUserAcct(clientInfo);
//        if(0 != countUserAcct) {
//            return AppResponse.bizError("用户账号已存在，请重新输入！");
//        }
        // 修改用户信息
        int count = clientDao.updateClient(clientInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    public AppResponse listUsers(ClientInfo clientInfo) {
        PageHelper.startPage(clientInfo.getPageNum(), clientInfo.getPageSize());
        List<ClientInfo> userInfoList = clientDao.listClientsByPage(clientInfo);
        // 包装Page对象

        PageInfo<ClientInfo> pageData = new PageInfo<ClientInfo>(userInfoList);
        System.out.println("list++"+pageData);
        AppResponse a=AppResponse.success("查询成功！", pageData);
        return a;
    }



}
