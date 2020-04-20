package com.xzsd.app.clientShopCart.dao;

import com.xzsd.app.clientShopCart.entity.ClientShopCartInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClientShopCartDao {
    /**
     * 新增购物车
     * @param clientShopCartInfo
     * @return
     */
    int addShoppingCart(ClientShopCartInfo clientShopCartInfo);

    /**
     * 判断同一件商品
     * @param clientShopCartInfo
     * @return
     */
    int countGoods(ClientShopCartInfo clientShopCartInfo);

    /**
     * 增加商品数量
     * @param clientShopCartInfo
     * @return
     */
    int addCount(ClientShopCartInfo clientShopCartInfo);

    /**
     * 购物车列表
     * @param userId
     * @return
     */
    List<ClientShopCartInfo> listShoppingCartsByPage(String userId);

    /**
     * 更新购物车
     * @param clientShopCartInfo
     * @return
     */
    int updateShoppingCart(ClientShopCartInfo clientShopCartInfo);

    /**
     * 删除购物车
     * @param idList
     * @return
     */
    int deleteShoppingCart(@Param("idList") List<String> idList);
}
