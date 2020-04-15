package com.xzsd.pc.menu.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.menu.dao.MenuDao;
import com.xzsd.pc.menu.entity.MenuInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class MenuService {
    @Resource
    private MenuDao menuDao;

    /**
     * 展示菜单
     * @return
     */
    public AppResponse listMenu(){
        List<MenuInfo> menuInfo = menuDao.listMenu();
        return AppResponse.success("查询成功",getPageInfo(menuInfo));
    }

    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteMenu(String menuId){
        int count = menuDao.deleteMenu(menuId);
        if(count == 0){
            return AppResponse.bizError("删除失败");
        }
        return AppResponse.success("删除成功");
    }

    /**
     * 更新菜单
     * @param menuInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateMenu(MenuInfo menuInfo){
        int count = menuDao.updateMenu(menuInfo);
        if (count == 0){
            return AppResponse.bizError("更新失败");
        }
        return AppResponse.success("更新成功");
    }

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    public AppResponse saveMenu(MenuInfo menuInfo){
        menuInfo.setMenuId(StringUtil.getCommonCode(2));
        int count = menuDao.saveMenu(menuInfo);
        if(count == 0){
            return AppResponse.bizError("新增失败");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 根据角色查菜单
     * @param role
     * @return
     */
    public AppResponse listMenuHome(int role){
        List<String> menuList = menuDao.listMenuHome(role);
        return AppResponse.success("查询成功",menuList);
    }

    /**
     * 查找菜单详情
     * @param menuId
     * @return
     */
    public AppResponse queryMenu(String menuId){
        MenuInfo menuInfo = menuDao.queryMenu(menuId);
        return AppResponse.success("查询成功",menuInfo);
    }
}
