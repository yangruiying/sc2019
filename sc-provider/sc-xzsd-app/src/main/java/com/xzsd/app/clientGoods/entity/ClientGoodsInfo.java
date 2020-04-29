package com.xzsd.app.clientGoods.entity;

import java.util.List;

public class ClientGoodsInfo {
    /**
     *商品名称
     */
    private String cName;
    /**
     *isbn书号
     */
    private String isbn;
    /**
     *商品介绍
     */
    private String introduce;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *商品评价
     */
    private String grade;
    /**
     *商品作者
     */
    private String author;
    /**
     *出版社
     */
    private String publish;
    /**
     *商品名称
     */
    private String shopName;
    /**
     *商品编号
     */
    private String cId;
    /**
     *客户编号
     */
    private String clientId;
    /**
     *分类id
     */
    private String sortId;
    /**
     *客户名称
     */
    private String name;
    /**
     *商品名称
     */
    private List<ClientGoodsInfo> goodsList;
    /**
     *销售价格
     */
    private String sell;
    /**
     *定价
     */
    private String price;
    /**
     *库存
     */
    private String inventory;
    /**
     *页数
     */
    private String pageNum;
    /**
     *页数大小
     */
    private String pageSize;
    /**
     *用户账号
     */
    private String account;
    /**
     * 评价内容
     */
    private String info;
    private String gmtCreate;
    /**
     * 购物车商品数
     */
    private String goodsNum;
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClientGoodsInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<ClientGoodsInfo> goodsList) {
        this.goodsList = goodsList;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }
}
