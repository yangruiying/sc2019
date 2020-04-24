package com.xzsd.pc.scroll.dao;


import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.order.entity.OrderInfo;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScrollDao {
    List<ScrollInfo> listScrollByPage(ScrollInfo scrollInfo);

    int deleteScroll(@Param("scrollList") List<String> scrollList);

    int stateGoods(ScrollInfo scrollInfo);

    int saveScroll(ScrollInfo scrollInfo);

    /**
     * 商品查询
     * @param goodsInfo
     * @return
     */
    List<GoodsInfo> listGoodsByPage(GoodsInfo goodsInfo);

    /**
     * 修改轮播图状态
     * @param listUpdate
     * @param state
     * @param createBy
     * @return
     */
    int stateScroll(@Param("listUpdate") List<ScrollInfo> listUpdate, @Param("state") int state,@Param("createBy") String createBy);

    /**
     * 判断商品重复
     * @param cId
     * @return
     */
    int countGoods(String cId);
}
