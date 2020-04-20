package com.xzsd.pc.menu.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.menu.dao.MenuDao;
import com.xzsd.pc.menu.entity.MenuInfo;
import org.apache.catalina.security.SecurityUtil;
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
            return AppResponse.versionError("版本错误,删除失败");
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
        String lastCreateBy = SecurityUtils.getCurrentUserId();
        menuInfo.setLastModifiedBy(lastCreateBy);
        int count = menuDao.updateMenu(menuInfo);
        if (count == 0){
            return AppResponse.versionError("版本错误,更新失败");
        }
        return AppResponse.success("更新成功");
    }

    /**
     * 新增菜单
     * @param menuInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveMenu(MenuInfo menuInfo){
        String createBy = SecurityUtils.getCurrentUserId();
        menuInfo.setCreateBy(createBy);
        int countName = menuDao.countName(menuInfo.getMenuName());
        if (countName != 0){
            return AppResponse.notFound("菜单名称重复,请重新输入");
        }
        menuInfo.setMenuId(StringUtil.getCommonCode(2));
        int count = menuDao.saveMenu(menuInfo);
        if(count == 0){
            return AppResponse.versionError("版本错误,新增失败");
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
