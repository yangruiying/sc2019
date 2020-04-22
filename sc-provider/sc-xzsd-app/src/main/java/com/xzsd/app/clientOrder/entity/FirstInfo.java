package com.xzsd.app.clientOrder.entity;

import java.util.List;

public class FirstInfo {
    private String orderId;
    private String orderState;
    private List<SecondInfo> goodsList;
    private double orderAllCost;
    private int orderAllGoodsCount;
    private String version;
    private String pageNum;
    private String pageSize;
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
}
