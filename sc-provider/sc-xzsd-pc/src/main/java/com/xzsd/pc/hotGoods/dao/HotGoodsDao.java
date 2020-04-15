package com.xzsd.pc.hotGoods.dao;

import com.xzsd.pc.hotGoods.entity.HotGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HotGoodsDao {
    int saveHotGoods(HotGoodsInfo hotGoodsInfo);
    int updateHotGoods(HotGoodsInfo hotGoodsInfo);
    int deleteHotGoods(@Param("hotGoodsList") List<String> hotGoodsList);
    HotGoodsInfo listGoodsByPage(HotGoodsInfo hotGoodsInfo);
    int countHotGoods(HotGoodsInfo hotGoodsInfo);

    /**
     * 更新展示数量
     * @param hotGoodsInfo
     * @return
     */
    int updateShowNum(HotGoodsInfo hotGoodsInfo);

    /**
     * 查找展示数量
     * @return
     */
    int getShowNum();

    /**
     * 热门商品编号
     * @param hId
     * @return
     */
    HotGoodsInfo queryHotGoods(String hId);
}
