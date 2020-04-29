package com.xzsd.pc.order.entity;

import org.joda.time.DateTime;

public class OrderInfo {
    /**
     *订单编号
     */
    private String orderId;
    /**
     *订单状态
     */
    private String orderState;
    /**
     *用户id
     */
    private String userId;
    /**
     *用户名称
     */
    private String userName;
    /**
     *门店id
     */
    private String shopId;
    /**
     *店长电话
     */
    private String phone;
    /**
     *确认时间
     */
    private String affirmTime;
    /**
     *开始时间
     */
    private String start;
    /**
     *结束时间
     */
    private String end;
    /**
     *总价
     */
    private  int sum;
    /**
     *商品id
     */
    private String cId;
    /**
     *商品名称
     */
    private String cName;
    /**
     *商品数量
     */
    private int num;
    /**
     *订单总价
     */
    private float orderSum;
    /**
     *成本价
     */
    private float price;
    /**
     *售价
     */
    private float sell;
    /**
     *版本号
     */
    private int version;
    /**
     *创建者
     */
    private String createBy;
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAffirmTime() {
        return affirmTime;
    }

    public void setAffirmTime(String affirmTime) {
        this.affirmTime = affirmTime;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(float orderSum) {
        this.orderSum = orderSum;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
