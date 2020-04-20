package com.xzsd.app.clientOrder.service;

import com.xzsd.app.clientOrder.dao.ClientOrderDao;
import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientOrderService {
    @Resource
    private ClientOrderDao clientOrderDao;
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addOrder(String cId,String goodsCount,String shopId){
        List<String> cIdList = Arrays.asList(cId);
        List<String> goodsCountList = Arrays.asList(goodsCount);
        List<String> shopIdList = Arrays.asList(shopId);
        List<ClientOrderInfo> clientOrderInfoList = new ArrayList<>();
        for (int i = 0 ; i < cIdList.size() ; i++){
            String orderId = StringUtil.getCommonCode(2);
            ClientOrderInfo clientOrderInfo = new ClientOrderInfo();
            clientOrderInfo.setOrderId(orderId);
            clientOrderInfo.setcId(cIdList.get(i));
            clientOrderInfo.setGoodsCount(Integer.parseInt(goodsCountList.get(i)));
            clientOrderInfo.setShopId(shopIdList.get(i));
            clientOrderInfoList.add(clientOrderInfo);
        }
        clientOrderDao.addOrder(clientOrderInfoList);
        return AppResponse.success("新增成功");
    }
}
