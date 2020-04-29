package com.xzsd.pc.menu.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.menu.entity.MenuInfo;
import com.xzsd.pc.menu.service.MenuService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/menu")
public class MenuController {
    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
    @Resource
    private MenuService menuService;

    /**
     * 展示菜单
     * @return
     */
    @RequestMapping(value = "listMenu")
    public AppResponse listMenu(){
        try {
            return menuService.listMenu();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    @PostMapping("deleteMenu")
    public AppResponse deleteMenu(String menuId){
        try {
            return menuService.deleteMenu(menuId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新菜单
     * @param menuInfo
     * @return
     */
    @PostMapping("updateMenu")
    public AppResponse updateMenu(MenuInfo menuInfo){
        try {
            return menuService.updateMenu(menuInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    @PostMapping("saveMenu")
    public AppResponse saveMenu(MenuInfo menuInfo){
        try {
            return menuService.saveMenu(menuInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 根据角色查菜单
     * @param role
     * @return
     */
    @RequestMapping(value = "listMenuHome")
    public AppResponse listMenuHome(int role){
        try {
            return menuService.listMenuHome(role);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查找菜单详情
     * @param menuId
     * @return
     */
    @RequestMapping(value = "queryMenu")
    public AppResponse queryMenu(String menuId){
        try {
            return menuService.queryMenu(menuId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
