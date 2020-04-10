package com.xzsd.pc.shop.dao;

import com.xzsd.pc.shop.entity.ShopInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopDao {
    /**
     * 新增门店
     */
    int saveShop(ShopInfo shopInfo);
    int countShop(ShopInfo shopInfo);
}
