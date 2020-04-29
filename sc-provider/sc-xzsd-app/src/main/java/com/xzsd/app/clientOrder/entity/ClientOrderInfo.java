package com.xzsd.app.clientOrder.entity;

import java.util.List;

public class ClientOrderInfo {
    /**
     * 商品id
     */
    private String cId;
    /**
     * 售价
     */
    private String sell;
    /**
     * 购买数量
     */
    private String goodsCount;
    /**
     *门店编号
     */
    private String shopId;
    /**
     *订单编号
     */
    private String orderId;
    /**
     *版本号
     */
    private String version;
    /**
     *订单状态
     */
    private String orderState;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *评价表
     */
    private String evaluateList;
    /**
     *图片数量
     */
    private String imageNum;
    /**
     *评价等级
     */
    private String rank;
    /**
     *评价等级
     */
    private String grade;
    /**
     *用户id
     */
    private String userId;

    private List<ClientOrderInfo> evaluate;
    private List<ClientOrderInfo> image;
    /**
     *评价内容
     */
    private String info;
    /**
     *库存
     */
    private String inventory;
    /**
     *购买数量
     */
    private String num;
    /**
     *门店名称
     */
    private String shopName;
    /**
     *门店地址
     */
    private String address;
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

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

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
}
