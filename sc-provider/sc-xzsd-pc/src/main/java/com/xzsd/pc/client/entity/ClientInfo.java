package com.xzsd.pc.client.entity;

import java.util.Date;

public class ClientInfo {
    /**
     * 客户编号
     */
    private String clientId;
    /**
     * 客户账号
     */
    private String account;
    /**
     * 门店编号
     */
    private String shopId;
    /**
     * 姓名
     */
    private String name;
    /**
     *性别 0代表男，1代表女
     */
    private int sex;
    /**
     * 手机
     */
    private String phone;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 邮箱
     */

    private String email;
    /**
     * 作废标记
     */
    private String isDeleted;
    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新者
     */
    private String lastModifiedBy;

    /**
     * 版本号
     */
    private int version;
    /**
     * 创建者
     */
    private String createBy;

    /**
     * 标记
     *
     */
    private String remark;

    /**
     * 更新时间
     *
     */
    private Date gmtModified;


    private int PageNum;
    private int PageSize;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateBy() {
        return createBy;
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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getExmail() {
        return email;
    }

    public void setExmail(String exmail) {
        this.email = exmail;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeletedd) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
