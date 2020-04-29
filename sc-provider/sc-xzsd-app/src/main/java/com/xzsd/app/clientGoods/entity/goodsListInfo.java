package com.xzsd.app.clientGoods.entity;

public class goodsListInfo {
    /**
     *商品id
     */
    private String cId;
    /**
     *商品名称
     */
    private String cName;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *售价
     */
    private double sell;

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }
}
