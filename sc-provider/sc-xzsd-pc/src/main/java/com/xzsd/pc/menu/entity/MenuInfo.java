package com.xzsd.pc.menu.entity;

public class MenuInfo {
    /**
     * 菜单id
     */
    private String menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 菜单路由
     */
    private String route;
    /**
     * 版本
     */
    private String version;
    /**
     *角色编号
     */
    private int role;
    private String createBy;
    private String lastModifiedBy;
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}
