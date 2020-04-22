package com.xzsd.app.clientOrder.dao;

import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
import com.xzsd.app.clientOrder.entity.FirstInfo;
import com.xzsd.app.clientOrder.entity.QueryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface ClientOrderDao {
    /**
     * 新增等待
     * @param orderList
     * @return
     */
    int addOrder(@Param("orderList") List<ClientOrderInfo> orderList);

    /**
     * 订单列表
     * @param orderState
     * @return
     */
    List<FirstInfo> listOrderByPage(String orderState);

    /**
     * 订单状态修改
     * @param clientOrderInfo
     * @return
     */
    int updateOrderState(ClientOrderInfo clientOrderInfo);

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    QueryInfo listOrderDeepen(String orderId);

    /**
     * 查询订单评价商品信息列表接口
     * @param orderId
     * @return
     */
    List<ClientOrderInfo> listGoodsForEvaluate(String orderId);

    /**
     * 新增订单商品评价接口
     * @param firstList
     * @return
     */
    int addGoodsEvaluate(@Param("firstList") List<ClientOrderInfo> firstList);
}
