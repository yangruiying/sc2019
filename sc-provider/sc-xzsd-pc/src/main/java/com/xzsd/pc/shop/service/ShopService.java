package com.xzsd.pc.shop.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.shop.dao.ShopDao;
import com.xzsd.pc.shop.entity.DictionariesInfo;
import com.xzsd.pc.shop.entity.ShopInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

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
        shopInfo.setInviteCode(StringUtil.getCommonCode(6));
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

    /**
     * 分页查询门店
     * @param shopInfo
     * @return
     */
    public AppResponse listShopByPage(ShopInfo shopInfo){
        List<ShopInfo> shopList = shopDao.listShopByPage(shopInfo);
        return AppResponse.success("查询成功",getPageInfo(shopList));
    }
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShop(ShopInfo shopInfo){
        int countShop = shopDao.countShop(shopInfo);
        if (countShop == 0){
            return AppResponse.bizError("编号不存在,请重新输入");
        }
        int count = shopDao.updateShop(shopInfo);
        if (count == 0){
            return AppResponse.versionError("数据有更新,请刷新");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 删除门店
     * @param shop_id
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShop(String shop_id){
        List<String> shopList = Arrays.asList(shop_id.split(","));
        int count = shopDao.deleteShop(shopList);
        return AppResponse.success("删除成功");
    }

    /**
     * 门店列表查询
     * @param shopId
     * @return
     */
    public AppResponse queryShop(String shopId){
        ShopInfo shopInfo = shopDao.queryShop(shopId);
        return AppResponse.success("查询成功",shopInfo);
    }
}
