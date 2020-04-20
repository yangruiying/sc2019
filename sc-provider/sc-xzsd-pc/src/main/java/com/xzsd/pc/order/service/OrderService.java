package com.xzsd.pc.order.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.order.dao.OrderDao;
import com.xzsd.pc.order.entity.OrderInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 订单列表查询
     * @param orderInfo
     * @return
     */
    public AppResponse listOrder(OrderInfo orderInfo){
        List<OrderInfo> orderList=orderDao.listOrder(orderInfo);
        return AppResponse.success("查询成功",orderList);
    }

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    public AppResponse queryOrder(String orderId){
        List<OrderInfo> cList = orderDao.queryOrder(orderId);
        return AppResponse.success("查询成功",cList);
    }

    /**
     * 修改订单状态
     * @param orderId
     * @param version
     * @param state
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrder(String orderId,String version,int state){
        List<String> idList = Arrays.asList(orderId.split(","));
        List<String> stateList = Arrays.asList(version.split(","));
        List<OrderInfo> orderStateList = new ArrayList();
        for(int i = 0 ; i < idList.size() ; i++){
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setOrderId(idList.get(i));
            orderInfo.setVersion(Integer.parseInt(stateList.get(i)));
            orderStateList.add(orderInfo);
        }
        int count = orderDao.updateOrder(orderStateList,state);
        if (count == 0){
            return AppResponse.versionError("版本错误,更新失败");
        }
        return AppResponse.success("更新成功");
    }
}
