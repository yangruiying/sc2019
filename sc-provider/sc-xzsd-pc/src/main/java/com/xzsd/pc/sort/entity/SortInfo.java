package com.xzsd.pc.sort.entity;



import java.io.Serializable;
import java.util.List;

public class SortInfo implements Serializable {

    private String sortId;
    /**
     * 父Id
     */
    private Integer parentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 备注
     */
    private String remark;

    /**
     * 子节点
     */
    private List<SortInfo> secondSort;


    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SortInfo> getSecondSort() {
        return secondSort;
    }

    public void setSecondSort(List<SortInfo> secondSort) {
        this.secondSort = secondSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
