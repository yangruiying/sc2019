package com.xzsd.pc.scroll.dao;


import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScrollDao {
    List<ScrollInfo> listScroll(ScrollInfo scrollInfo);

    int deleteScroll(@Param("scrollList") List<String> scrollList);

    int stateGoods(ScrollInfo scrollInfo);

    int saveScroll(ScrollInfo scrollInfo);

    /**
     * 商品查询
     * @param goodsInfo
     * @return
     */
    List<GoodsInfo> listGoods(GoodsInfo goodsInfo);

    /**
     * 修改轮播图状态
     * @param idList
     * @param state
     * @return
     */
    int stateScroll(@Param("idList") List<String> idList,@Param("state") int state);

}
