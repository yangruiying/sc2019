package com.xzsd.pc.menu.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.menu.entity.MenuInfo;
import com.xzsd.pc.menu.service.MenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Resource
    private MenuService menuService;

    /**
     * 展示菜单
     * @return
     */
    @RequestMapping(value = "listMenu")
    public AppResponse listMenu(){
        return menuService.listMenu();
    }

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    @PostMapping("deleteMenu")
    public AppResponse deleteMenu(String menuId){
        return menuService.deleteMenu(menuId);
    }

    /**
     * 更新菜单
     * @param menuInfo
     * @return
     */
    @PostMapping("updateMenu")
    public AppResponse updateMenu(MenuInfo menuInfo){
        return menuService.updateMenu(menuInfo);
    }

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    @PostMapping("saveMenu")
    public AppResponse saveMenu(MenuInfo menuInfo){
        return menuService.saveMenu(menuInfo);
    }

    /**
     * 根据角色查菜单
     * @param role
     * @return
     */
    @RequestMapping(value = "listMenuHome")
    public AppResponse listMenuHome(int role){
        return menuService.listMenuHome(role);
    }

    /**
     * 查找菜单详情
     * @param menuId
     * @return
     */
    @RequestMapping(value = "queryMenu")
    public AppResponse queryMenu(String menuId){
        return menuService.queryMenu(menuId);
    }
}
