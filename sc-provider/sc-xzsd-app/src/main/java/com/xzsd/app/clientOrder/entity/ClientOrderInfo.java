package com.xzsd.app.clientOrder.entity;

import java.util.List;

public class ClientOrderInfo {
    private String cId;
    private String sell;
    private String goodsCount;
    private String shopId;
    private String orderId;
    private String version;
    private String orderState;
    private String imagePath;
    private String evaluateList;
    private String imageNum;
    private String rank;
    private String grade;
    private String userId;
    private List<ClientOrderInfo> evaluate;
    private List<ClientOrderInfo> image;
    private String info;
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }



    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getEvaluateList() {
        return evaluateList;
    }

    public void setEvaluateList(String evaluateList) {
        this.evaluateList = evaluateList;
    }

    public String getImageNum() {
        return imageNum;
    }

    public void setImageNum(String imageNum) {
        this.imageNum = imageNum;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public List<ClientOrderInfo> getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(List<ClientOrderInfo> evaluate) {
        this.evaluate = evaluate;
    }

    public List<ClientOrderInfo> getImage() {
        return image;
    }

    public void setImage(List<ClientOrderInfo> image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
