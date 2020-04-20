package com.xzsd.pc.topOfColumn.entity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class TopOfColumnInfo {
    /**
     * 用户姓名
     */
    private String userName;

    private String userImage;
    /**
     * 用户id
     */
    private String userId;

    private int role;
    private String imagePath;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
