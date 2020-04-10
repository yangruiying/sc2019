package com.xzsd.pc.shop.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.shop.dao.ShopDao;
import com.xzsd.pc.shop.entity.DictionariesInfo;
import com.xzsd.pc.shop.entity.ShopInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopService {
    @Resource
    private ShopDao shopDao;


    /**
     * 新增门店
     * @param shopInfo
     * @return
     */
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

    /**
     * 省下拉查询
     * @return
     */
    public AppResponse provinceList(){
        List<DictionariesInfo> provinceList=shopDao.provinceList();
        return AppResponse.success("查询成功",provinceList);
    }

    /**
     * 市下拉查询
     * @param dictionariesInfo
     * @return
     */
    public AppResponse cityList(DictionariesInfo dictionariesInfo){
        List<DictionariesInfo> cityList=shopDao.cityList(dictionariesInfo);
        return AppResponse.success("查询成功",cityList);
    }
}
