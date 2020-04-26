package com.xzsd.app.clientGoods.dao;

import com.xzsd.app.clientGoods.entity.ClientGoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientGoodsDao {
    /**
     * 查询商品信息详情
     * @param clientGoodsInfo
     * @return
     */
    ClientGoodsInfo getGoods(ClientGoodsInfo clientGoodsInfo);

    /**
     * 一级分类
     * @return
     */
    List<ClientGoodsInfo> listOneGoodsClassify();

    /**
     * 二级分类及商品信息
     * @param sortId
     * @return
     */
    List<ClientGoodsInfo> getNodeTree(String sortId);

    /**
     * 商品评价列表
     * @param clientGoodsInfo
     * @return
     */
    List<ClientGoodsInfo> listGoodsEvaluates(ClientGoodsInfo clientGoodsInfo);
}
