package com.xzsd.pc.shop.entity;

public class DictionariesInfo {
    /**
     *字典表id
     */
    private String id;
    /**
     *父级编号
     */
    private String parentId;
    /**
     *字段值
     */
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
