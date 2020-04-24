package com.xzsd.app.clientShopCart.service;

import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.clientShopCart.dao.ClientShopCartDao;
import com.xzsd.app.clientShopCart.entity.ClientShopCartInfo;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class ClientShopCartService {
    @Resource
    private ClientShopCartDao clientShopCartDao;

    /**
     * 新增购物车
     * @param clientShopCartInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addShoppingCart(ClientShopCartInfo clientShopCartInfo){
        String userId = SecurityUtils.getCurrentUserId();
        clientShopCartInfo.setUserId(userId);
        //判断同一件商品
        int countGoods = clientShopCartDao.countGoods(clientShopCartInfo);
        if (countGoods != 0){
            //新增商品数量
            int count = clientShopCartDao.addCount(clientShopCartInfo);
            if (count == 0){
                return AppResponse.versionError("新增失败");
            }
            return AppResponse.success("新增成功");
        }
        //新增商品类别
        String cartId = StringUtil.getCommonCode(2);
        clientShopCartInfo.setCartId(cartId);
        int count = clientShopCartDao.addShoppingCart(clientShopCartInfo);
        if (count == 0){
            return AppResponse.versionError("新增失败");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 购物车列表
     * @return
     */
    public AppResponse listShoppingCarts(){
        String userId = SecurityUtils.getCurrentUserId();
        List<ClientShopCartInfo> cartList = clientShopCartDao.listShoppingCartsByPage(userId);
        return AppResponse.success("查询成功",getPageInfo(cartList));
    }

    /**
     * 更新购物车
     * @param clientShopCartInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShoppingCart(ClientShopCartInfo clientShopCartInfo){
        int count = clientShopCartDao.updateShoppingCart(clientShopCartInfo);
        if (count == 0){
            return AppResponse.versionError("更新失败");
        }
        return AppResponse.success("更新成功");
    }

    /**
     * 删除购物车
     * @param cardId
     * @return
     */
    public AppResponse deleteShoppingCart(String cardId){
        List<String> idList = Arrays.asList(cardId.split(","));
        int count = clientShopCartDao.deleteShoppingCart(idList);
        if (count == 0){
            return AppResponse.versionError("删除失败");
        }
        return AppResponse.success("删除成功");
    }
}
