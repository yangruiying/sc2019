package com.xzsd.pc.scroll.entity;

public class ScrollInfo {
    /**
     *轮播图编号
     */
    private String pId;
    /**
     *商品编号
     */
    private String cId;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *排序
     */
    private String sort;
    /**
     *轮播图状态
     */
    private String state;
    /**
     *有限期起
     */
    private String begin;
    /**
     *有效期止
     */
    private String end;
    /**
     *删除标记
     */
    private String isDeleted;
    /**
     *页面数
     */
    private String pageNum;
    /**
     *页面大小
     */
    private String pageSize;
    /**
     *版本号
     */
    private String version;
    /**
     *创建者
     */
    private String createBy;
    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }



    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
