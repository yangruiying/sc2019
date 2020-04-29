package com.xzsd.app.clientOrder.entity;

public class SecondInfo {
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
    private double sell;
    /**
     *商品数量
     */
    private int goodsCount;
    /**
     *商品编号
     */
    private String cId;

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

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }
}
