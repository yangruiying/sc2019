package com.xzsd.app.clientOrder.dao;

import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
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
}
