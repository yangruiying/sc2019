package com.xzsd.pc.goods.dao;

import com.xzsd.pc.goods.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    List<GoodsInfo> listGoodsByPage(GoodsInfo goodsInfo);
    int saveGoods(GoodsInfo goodsInfo);
    GoodsInfo getGoodsById(String Cid);
    int deleteGoods(@Param("codeList") List<String> codeList);


}
