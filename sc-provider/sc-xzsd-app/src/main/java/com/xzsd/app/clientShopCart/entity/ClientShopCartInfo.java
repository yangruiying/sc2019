package com.xzsd.app.clientShopCart.entity;

public class ClientShopCartInfo {
    /**
     *商品id
     */
    private String cId;
    /**
     *商品数量
     */
    private int goodsCount;
    /**
     *用户id
     */
    private String userId;
    /**
     *商品数量
     */
    private int num;
    /**
     *购物车编号
     */
    private String cartId;
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

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
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
