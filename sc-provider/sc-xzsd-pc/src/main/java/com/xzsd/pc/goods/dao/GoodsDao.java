package com.xzsd.pc.goods.dao;

import com.xzsd.pc.goods.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    /**
     * 商品分页查询
     * @param goodsInfo
     * @return
     */
    List<GoodsInfo> listGoodsByPage(GoodsInfo goodsInfo);

    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */
    int saveGoods(GoodsInfo goodsInfo);

    /**
     * 查找商品
     * @param cId
     * @return
     */
    GoodsInfo queryGoods(String cId);

    /**
     * 删除商品
     * @param codeList
     * @return
     */
    int deleteGoods(@Param("codeList") List<String> codeList);

    /**
     * 查找重复书号
     * @param isbn
     * @return
     */
    int countIsbn(String isbn);

    /**
     * 更新商品
     * @param goodsInfo
     * @return
     */
    int updateGoods(GoodsInfo goodsInfo);

    /**
     * 商品编号数量
     * @param cId
     * @return
     */
    int countCid(String cId);
}
