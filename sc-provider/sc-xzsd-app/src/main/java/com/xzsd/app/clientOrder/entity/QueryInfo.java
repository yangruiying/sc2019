package com.xzsd.app.clientOrder.entity;

import java.util.List;

public class QueryInfo {
    /**
     * 门店名称
     */
    private String shopName;
    /**
     *门店地址
     */
    private String address;
    /**
     *商品列表
     */
    private List<SecondInfo> goodsList;
    /**
     *花费总价
     */
    private double orderAllCost;
    /**
     *购买数量
     */
    private int orderAllGoodsCount;
    /**
     *订单编号
     */
    private String orderId;
    /**
     *创建时间
     */
    private String createTime;
    /**
     *订单状态
     */
    private String orderState;
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<SecondInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<SecondInfo> goodsList) {
        this.goodsList = goodsList;
    }

    public double getOrderAllCost() {
        return orderAllCost;
    }

    public void setOrderAllCost(double orderAllCost) {
        this.orderAllCost = orderAllCost;
    }

    public int getOrderAllGoodsCount() {
        return orderAllGoodsCount;
    }

    public void setOrderAllGoodsCount(int orderAllGoodsCount) {
        this.orderAllGoodsCount = orderAllGoodsCount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }
}
