package com.xzsd.pc.client.controller;



import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.AuthUtils;
import com.xzsd.pc.client.entity.ClientInfo;
import com.xzsd.pc.client.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户增删改查
 */
@RestController
@RequestMapping("/client")
public class ClientController {
    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Resource
    private ClientService clientService;


//    /**
//     * 新增客户
//     */
//
//    @PostMapping("saveClient")
//    public AppResponse saveClient(ClientInfo clientinfo) {
//        try {
//            //获取用户id
//            String userId = AuthUtils.getCurrentUserId();
//            clientinfo.setCreateBy(userId);
//            AppResponse appResponse = clientService.saveClient(clientinfo);
//            return appResponse;
//        } catch (Exception e) {
//            logger.error("用户新增失败", e);
//            System.out.println(e.toString());
//            throw e;
//        }
//    }
//
//    @RequestMapping(value = "getClientByUserCode")
//    public AppResponse getClientByUserCode(String userCode) {
//        try {
//            return clientService.getClientByUserCode(userCode);
//        } catch (Exception e) {
//            logger.error("用户查询错误", e);
//            System.out.println(e.toString());
//            throw e;
//        }
//    }
//
//    @PostMapping("deleteClient")
//    public AppResponse deleteClient(String clientClient){
//        try {
//            //获取用户id
//            String userId = AuthUtils.getCurrentUserId();
//            return clientService.deleteClient(clientClient);
//        } catch (Exception e) {
//            logger.error("用户删除错误", e);
//            System.out.println(e.toString());
//            throw e;
//        }
//
//
//    }
//
//    @PostMapping("updateClient")
//    public AppResponse updateUser(ClientInfo clientInfo) {
//        try {
//            //获取用户id
//            String userId = AuthUtils.getCurrentUserId();
//            clientInfo.setCreateBy(userId);
//            //clientInfo.setLastModifiedBy(userId);
//            return clientService.updateClient(clientInfo);
//        } catch (Exception e) {
//            logger.error("修改用户信息错误", e);
//            System.out.println(e.toString());
//            throw e;
//        }
//    }

    /**
     * 客户列表查询
     * @param clientInfo
     * @return
     */
    @RequestMapping(value = "listClients")
    public AppResponse listUsers(ClientInfo clientInfo) {
        try {
            AppResponse a =clientService.listClient(clientInfo);
            return a;
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }



}
