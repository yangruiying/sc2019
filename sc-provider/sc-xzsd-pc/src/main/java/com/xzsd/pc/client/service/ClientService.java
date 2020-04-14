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

    /**
     * 客户列表
     * @param clientInfo
     * @return
     */
    public AppResponse listClient(ClientInfo clientInfo) {
        PageHelper.startPage(clientInfo.getPageNum(), clientInfo.getPageSize());
        List<ClientInfo> userInfoList = clientDao.listClientsByPage(clientInfo);
        // 包装Page对象
        PageInfo<ClientInfo> pageData = new PageInfo<ClientInfo>(userInfoList);
        System.out.println("list++"+pageData);
        return AppResponse.success("查询成功！", pageData);
    }

}
