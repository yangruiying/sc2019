package com.xzsd.app.clientGoods.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.clientGoods.dao.ClientGoodsDao;
import com.xzsd.app.clientGoods.entity.ClientGoodsInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClientGoodsService {
    @Resource
    private ClientGoodsDao clientGoodsDao;

    /**
     * 查询商品详情
     * @param cId
     * @return
     */
    public AppResponse getGoods(String cId){
        String clientId = SecurityUtils.getCurrentUserId();
        ClientGoodsInfo setInfo = new ClientGoodsInfo();
        setInfo.setClientId(clientId);
        setInfo.setcId(cId);
        ClientGoodsInfo clientGoodsInfo = clientGoodsDao.getGoods(setInfo);
        return AppResponse.success("查找成功",clientGoodsInfo);
    }

    /**
     * 一级分类
     * @return
     */
    public AppResponse listOneGoodsClassify(){
        List<ClientGoodsInfo> clientGoodsInfo = clientGoodsDao.listOneGoodsClassify();
        return AppResponse.success("查询成功",clientGoodsInfo);
    }

    public AppResponse getNodeTree(String sortId){
        List<ClientGoodsInfo> clientGoodsInfo = clientGoodsDao.getNodeTree(sortId);
        return AppResponse.success("查找成功",clientGoodsInfo);
    }
}
