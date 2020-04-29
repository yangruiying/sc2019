package com.xzsd.app.register.entity;

public class RegisterInfo {
    /**
     *客户编号
     */
    private String clientId;
    /**
     *客户账号
     */
    private String account;
    /**
     *用户名
     */
    private String userName;
    /**
     *用户性别
     */
    private int sex;
    /**
     *用户电话
     */
    private String phone;
    /**
     *用户邮箱
     */
    private String email;
    /**
     *用户身份证
     */
    private String idCard;
    /**
     *用户密码
     */
    private String password;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *邀请码
     */
    private String inviteCode;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
