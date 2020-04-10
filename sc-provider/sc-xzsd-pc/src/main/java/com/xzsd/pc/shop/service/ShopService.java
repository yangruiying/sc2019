package com.xzsd.pc.shop.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.shop.dao.ShopDao;
import com.xzsd.pc.shop.entity.ShopInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ShopService {
    @Resource
    private ShopDao shopDao;

    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveShop(ShopInfo shopInfo){
        int countShop = shopDao.countShop(shopInfo);
        if (0 != countShop){
            return AppResponse.success("门店编号已存在");
        }
        int count = shopDao.saveShop(shopInfo);
        if(count == 0){
            return AppResponse.success("新增失败");
        }
        return AppResponse.success("新增成功");
    }
}
