package com.xzsd.pc.shop.dao;

import com.xzsd.pc.shop.entity.DictionariesInfo;
import com.xzsd.pc.shop.entity.ShopInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopDao {
    /**
     * 新增门店
     */
    int saveShop(ShopInfo shopInfo);

    /**
     * 统计门店数量
     * @param shopInfo
     * @return
     */
    int countLicense(ShopInfo shopInfo);

    /**
     * 统计门店数量
     * @param shopInfo
     * @return
     */
    int countShop(ShopInfo shopInfo);

    /**
     * 统计邀请码数量
     */
    int countInvite(ShopInfo shopInfo);



    /**
     * 省市区下拉查询
     * @param id
     * @return
     */
    List<DictionariesInfo> listArea(String id);

    /**
     * 分页查询门店信息
     * @param shopInfo
     * @return
     */
    List<ShopInfo> listShopByPage(ShopInfo shopInfo);

    /**
     * 更新门店
     * @param shopInfo
     * @return
     */
    int updateShop(ShopInfo shopInfo);

    /**
     * 删除门店
     * @param shopIdList
     * @return
     */
    int deleteShop(@Param("shopIdList") List<String> shopIdList);

    /**
     * 门店详情
     * @param shopId
     * @return
     */
    ShopInfo queryShop(String shopId);
}
