package com.xzsd.pc.sort.entity;



import java.io.Serializable;
import java.util.List;

public class SortInfo implements Serializable {

    private Integer sortId;
    /**
     * 父Id
     */
    private Integer parentId;
    /**
     * 部门名称
     */
    private String name;

    /**
     * 子节点
     */
    private List<SortInfo> treeNode;
    /**
     * 备注
     */
    private String remark;
    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
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

    public List<SortInfo> getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(List<SortInfo> treeNode) {
        this.treeNode = treeNode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
