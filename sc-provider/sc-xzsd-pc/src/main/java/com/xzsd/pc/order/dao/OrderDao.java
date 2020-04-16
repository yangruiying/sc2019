package com.xzsd.pc.order.dao;

import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.order.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderDao {
    List<OrderInfo> listOrder(OrderInfo orderInfo);

    List<OrderInfo> queryOrder(String orderId);

    /**
     * 订单状态修改
     * @param listUpdate
     * @param state
     * @return
     */
    int updateOrder(@Param("listUpdate") List<OrderInfo> listUpdate, @Param("state") int state);
}
