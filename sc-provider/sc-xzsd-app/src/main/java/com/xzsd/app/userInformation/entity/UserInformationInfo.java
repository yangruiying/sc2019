package com.xzsd.app.userInformation.entity;

public class UserInformationInfo {
    /**
     *用户名
     */
    private String userName;
    /**
     *图片路径
     */
    private String imagePath;
    /**
     *角色编号
     */
    private int role;
    /**
     *门店id
     */
    private String shopId;
    /**
     *门店名称
     */
    private String shopName;
    /**
     *邀请码
     */
    private String inviteCode;
    /**
     *地址
     */
    private String address;
    /**
     *
     */
    private String phone;
    /**
     *版本号
     */
    private String version;
    /**
     *旧密码
     */
    private String oldPassword;
    /**
     *用户id
     */
    private String userId;
    /**
     *新密码
     */
    private String newPassword;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
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

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
