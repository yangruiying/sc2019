package com.xzsd.pc.goods.entity;

public class GoodsInfo {
    /**
     * 商品id
     */
    private String Cid;
    /**
     * 商品名称
     */
    private String Cname;
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
    private String first_classify;
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
    private String putaway_time;
    /**
     * 浏览量
     */
    private int browse_num;
    /**
     * 商家编码
     */
    private String shop_id;
    /**
     * 商家名称
     */
    private String shop_name;
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

    private String imagePath;

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
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

    public String getFirst_classify() {
        return first_classify;
    }

    public void setFirst_classify(String first_classify) {
        this.first_classify = first_classify;
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

    public String getPutaway_time() {
        return putaway_time;
    }

    public void setPutaway_time(String putaway_time) {
        this.putaway_time = putaway_time;
    }

    public int getBrowse_num() {
        return browse_num;
    }

    public void setBrowse_num(int browse_num) {
        this.browse_num = browse_num;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
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
}
