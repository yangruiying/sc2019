package com.xzsd.app.clientOrder.dao;

import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
import com.xzsd.app.clientOrder.entity.FirstInfo;
import com.xzsd.app.clientOrder.entity.QueryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.method.P;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface ClientOrderDao {
    /**
     * 新增订单
     * @param orderList
     * @param userId
     * @param shopId
     * @return
     */
    int addOrder(@Param("orderList") List<ClientOrderInfo> orderList, @Param("userId") String userId, @Param("shopId") String shopId);

    /**
     * 订单列表
     * @param clientOrderInfo
     * @return
     */
    List<FirstInfo> listOrderByPage(ClientOrderInfo clientOrderInfo);

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
     * 新增订单评价
     * @param firstList
     * @param userId
     * @return
     */
    int addGoodsEvaluate(@Param("firstList") List<ClientOrderInfo> firstList,@Param("userId") String userId , @Param("orderId") String orderId);

    /**
     * 清空购物车
     * @param cList
     * @param userId
     * @return
     */
    int clearCart(@Param("cList") List<String> cList,@Param("userId") String userId);

    /**
     * 修改商品星级
     * @return
     */
    int changeGrade();

    /**
     * 修改库存
     * @param goodsList
     * @return
     */
    int inventoryChange(@Param("goodsList") List<ClientOrderInfo> goodsList);

    /**
     * 增加库存
     * @param goodsList
     * @return
     */
    int inventoryAdd(@Param("goodsList") List<ClientOrderInfo> goodsList);
    /**
     * 查看库存
     * @param cList
     * @return
     */
    List<ClientOrderInfo> countInventory(@Param("cList") List cList);

    /**
     * 获取订单商品编号和数量
     * @param orderId
     * @return
     */
    List<ClientOrderInfo> orderGoods(String orderId);

    /**
     * 增加库存
     * @param goodsList
     * @return
     */
    int addNum(@Param("goodsList") List<ClientOrderInfo> goodsList);
}
