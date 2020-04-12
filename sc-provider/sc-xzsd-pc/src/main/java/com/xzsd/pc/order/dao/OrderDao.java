package com.xzsd.pc.order.dao;

import com.xzsd.pc.order.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderDao {
    List<OrderInfo> listOrder(OrderInfo orderInfo);

    List<OrderInfo> queryOrder(String orderId);

    int updateOrder(OrderInfo orderInfo);
}
