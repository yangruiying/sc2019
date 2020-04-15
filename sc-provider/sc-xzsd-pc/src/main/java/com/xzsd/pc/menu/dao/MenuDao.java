package com.xzsd.pc.menu.dao;

import com.xzsd.pc.menu.entity.MenuInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDao {
    /**
     * 展示菜单
     * @return
     */
    List<MenuInfo> listMenu();

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    int deleteMenu(String menuId);

    /**
     * 更新菜单
     * @param menuInfo
     * @return
     */
    int updateMenu(MenuInfo menuInfo);

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    int saveMenu(MenuInfo menuInfo);

    /**
     * 根据角色查菜单
     * @param role
     * @return
     */
    List<String> listMenuHome(int role);

    /**
     * 查找菜单详情
     * @param menuId
     * @return
     */
    MenuInfo queryMenu(String menuId);
}
