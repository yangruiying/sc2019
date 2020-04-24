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
     * @param showNum
     * @return
     */
    List<ClientHomeInfo> listHotGoods(int showNum);
    /**
     * 查询热门商品展示数量
     */
    int getShowNum();
}
