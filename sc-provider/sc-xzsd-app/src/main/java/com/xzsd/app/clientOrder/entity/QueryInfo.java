package com.xzsd.app.clientOrder.entity;

import java.util.List;

public class QueryInfo {
    private String shopName;
    private String address;
    private List<SecondInfo> goodsList;
    private double orderAllCost;
    private int orderAllGoodsCount;
    private String orderId;

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
}
