package com.xzsd.app.clientHome.dao;

import com.xzsd.app.clientHome.entity.ClientHomeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientHomeDao {
    /**
     * 首页轮播图
     * @return
     */
    List<ClientHomeInfo> listRotationCharHome();

    /**
     * 热门商品
     * @return
     */
    List<ClientHomeInfo> listHotGoods();
}
