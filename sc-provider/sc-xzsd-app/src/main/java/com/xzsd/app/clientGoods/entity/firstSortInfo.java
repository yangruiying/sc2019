package com.xzsd.app.clientGoods.entity;

import java.util.List;

public class firstSortInfo {
    /**
     *分类id
     */
    private String sortId;
    /**
     *分类名称
     */
    private String name;
    private List<ClientGoodsInfo> goodsList;

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClientGoodsInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<ClientGoodsInfo> goodsList) {
        this.goodsList = goodsList;
    }
}
