package com.xzsd.app.clientHome.entity;

public class ClientHomeInfo {
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *商品id
     */
    private String cId;
    /**
     *商品名称
     */
    private String cName;
    /**
     *商品售价
     */
    private double sell;
    /**
     *展示数量
     */
    private int showNum;
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public int getShowNum() {
        return showNum;
    }

    public void setShowNum(int showNum) {
        this.showNum = showNum;
    }
}
