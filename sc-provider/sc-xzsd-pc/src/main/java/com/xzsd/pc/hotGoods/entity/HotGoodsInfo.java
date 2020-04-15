package com.xzsd.pc.hotGoods.entity;

public class HotGoodsInfo {
    /**
     * 商品id
     */
    private String cId;
    /**
     * 排序
     */
    private String sort;
    /**
     * 热门编号
     */
    private String hId;
    /**
     * 商品名称
     */
    private String cName;
    /**
     * 展示数量
     */
    private int showNum;
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getShowNum() {
        return showNum;
    }

    public void setShowNum(int showNum) {
        this.showNum = showNum;
    }
}
