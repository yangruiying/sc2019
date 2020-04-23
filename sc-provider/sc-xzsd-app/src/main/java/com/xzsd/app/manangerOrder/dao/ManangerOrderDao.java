package com.xzsd.app.manangerOrder.dao;

import com.xzsd.app.manangerOrder.entity.ManangerOrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManangerOrderDao {
    /**
     * 店长订单列表
     */
    List<ManangerOrderInfo> listManagerOrdersByPage(String orderState);

    /**
     * 店长订单状态修改
     * @param manangerOrderInfo
     * @return
     */
    int updateManangerOrderState(ManangerOrderInfo manangerOrderInfo);

    /**
     * 查询店长订单
     * @param orderId
     * @return
     */
    ManangerOrderInfo listManagerOrderDeepen(String orderId);
}
