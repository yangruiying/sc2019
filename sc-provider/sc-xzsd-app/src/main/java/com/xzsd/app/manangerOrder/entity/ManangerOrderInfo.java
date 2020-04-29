package com.xzsd.app.manangerOrder.entity;

import java.util.List;

public class ManangerOrderInfo {
    /**
     *订单状态
     */
    private String orderState;
    /**
     *页面大小
     */
    private String pageSize;
    /**
     *页面数量
     */
    private String pageNum;
    /**
     *订单编号
     */
    private String orderId;
    /**
     *商品名称
     */
    private String cName;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *商品介绍
     */
    private String introduce;
    /**
     *售价
     */
    private String sell;
    /**
     *商品数量
     */
    private String goodsCount;
    /**
     *商品id
     */
    private String cId;
    /**
     *用户id
     */
    private String userId;
    /**
     *用户名称
     */
    private String userName;
    /**
     *用户电话
     */
    private String phone;
    /**
     *订单商品数量
     */
    private String orderAllCost;
    /**
     *订单商品总价
     */
    private String orderAllGoodsCount;
    /**
     *版本号
     */
    private String version;
    /**
     *商品名称
     */
    private String shopName;
    /**
     *确认时间
     */
    private String affirmTime;
    private List<ManangerOrderInfo> goodsList;
    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderAllCost() {
        return orderAllCost;
    }

    public void setOrderAllCost(String orderAllCost) {
        this.orderAllCost = orderAllCost;
    }

    public String getOrderAllGoodsCount() {
        return orderAllGoodsCount;
    }

    public void setOrderAllGoodsCount(String orderAllGoodsCount) {
        this.orderAllGoodsCount = orderAllGoodsCount;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ManangerOrderInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<ManangerOrderInfo> goodsList) {
        this.goodsList = goodsList;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAffirmTime() {
        return affirmTime;
    }

    public void setAffirmTime(String affirmTime) {
        this.affirmTime = affirmTime;
    }
}

