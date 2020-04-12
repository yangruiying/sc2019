package com.xzsd.pc.order.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.order.dao.OrderDao;
import com.xzsd.pc.order.entity.OrderInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {
    @Resource
    private OrderDao orderDao;

    public AppResponse listOrder(OrderInfo orderInfo){
        List<OrderInfo> orderList=orderDao.listOrder(orderInfo);
        return AppResponse.success("查询成功",orderList);
    }

    public AppResponse queryOrder(String orderId){
        List<OrderInfo> cList = orderDao.queryOrder(orderId);
        return AppResponse.success("查询成功",cList);
    }

    public AppResponse updateOrde(OrderInfo orderInfo){
        int count = orderDao.updateOrder(orderInfo);
        return AppResponse.success("更新成功");
    }
}
