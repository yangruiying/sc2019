package com.xzsd.pc.HotGoods.dao;

import com.xzsd.pc.HotGoods.entity.HotGoodsInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotGoodsDao {
    int saveHotGoods(HotGoodsInfo hotGoodsInfo);
    int updateHotGoods(HotGoodsInfo hotGoodsInfo);
}
