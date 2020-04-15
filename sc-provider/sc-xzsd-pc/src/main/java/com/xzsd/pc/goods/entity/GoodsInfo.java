package com.xzsd.pc.goods.entity;

public class GoodsInfo {
    /**
     * 商品id
     */
    private String cId;
    /**
     * 商品名称
     */
    private String cName;
    /**
     * 出版社
     */
    private String publish;
    /**
     * 状态
     */
    private int state;
    /**
     * 定价
     */
    private float price;
    /**
     * 售价
     */
    private float sell;
    /**
     * 销售量
     */
    private int num;
    /**
     * 一级分类
     */
    private String firstClassifyId;

    /**
     * 一级分类名称
     */
    private String firstClassifyName;

    /**
     * 二级分类编号
     */
    private String secondClassifyId;
    /**
     * 二级分类名称
     */
    private String secondClassifyName;
    /**
     * 广告词
     */
    private String advertising;
    /**
     * 商品介绍
     */
    private String introduce;
    /**
     * 上架时间
     */
    private String putawayTime;
    /**
     * 浏览量
     */
    private int browseNum;
    /**
     * 商家编码
     */
    private String shopId;
    /**
     * 商家名称
     */
    private String shopName;
    /**
     * 库存
     */
    private int inventory;
    /**
     * 作废标记
     */
    private int isDeleted;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private String gmtModified;
    /**
     * 更新者
     */
    private String lastModifiedBy;
    /**
     * 版本号
     */
    private int version;
    /**
     * 第几页
     */
    private int PageNum;
    /**
     * 每页显示条数
     */
    private int PageSize;
    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 书号
     */
    private String isbn;

    /**
     * 作者
     */
    private  String author;

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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public String getAdvertising() {
        return advertising;
    }

    public void setAdvertising(String advertising) {
        this.advertising = advertising;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPageNum() {
        return PageNum;
    }

    public void setPageNum(int pageNum) {
        PageNum = pageNum;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFirstClassifyId() {
        return firstClassifyId;
    }

    public void setFirstClassifyId(String firstClassifyId) {
        this.firstClassifyId = firstClassifyId;
    }

    public String getFirstClassifyName() {
        return firstClassifyName;
    }

    public void setFirstClassifyName(String firstClassifyName) {
        this.firstClassifyName = firstClassifyName;
    }

    public String getSecondClassifyId() {
        return secondClassifyId;
    }

    public void setSecondClassifyId(String secondClassifyId) {
        this.secondClassifyId = secondClassifyId;
    }

    public String getSecondClassifyName() {
        return secondClassifyName;
    }

    public void setSecondClassifyName(String secondClassifyName) {
        this.secondClassifyName = secondClassifyName;
    }

    public String getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(String putawayTime) {
        this.putawayTime = putawayTime;
    }

    public int getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(int browseNum) {
        this.browseNum = browseNum;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
