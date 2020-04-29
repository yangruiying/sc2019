package com.xzsd.app.clientOrder.entity;

import java.util.List;

public class FirstInfo {
    /**
     *订单编号
     */
    private String orderId;
    /**
     *订单状态
     */
    private String orderState;
    /**
     *商品列表
     */
    private List<SecondInfo> goodsList;
    /**
     *商品总价
     */
    private double orderAllCost;
    /**
     *商品数量
     */
    private int orderAllGoodsCount;
    /**
     *版本号
     */
    private String version;
    /**
     *页面数
     */
    private String pageNum;
    /**
     *页面大小
     */
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
