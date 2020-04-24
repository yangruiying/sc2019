package com.xzsd.pc.shop.service;

import com.neusoft.core.restful.AppResponse;

import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.RandomUtil;
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
        String userId = SecurityUtils.getCurrentUserId();
        shopInfo.setCreateBy(userId);
        String license = StringUtil.getCommonCode(2);
        String invite = StringUtil.getCommonCode(2);
        shopInfo.setLicense(license);
        shopInfo.setInviteCode(invite);
        int countLicense = shopDao.countLicense(shopInfo);
        int countInvite = shopDao.countInvite(shopInfo);
        //判断营业执照是否存在
        if(countLicense != 0){
            return AppResponse.notFound("营业执照已存在");
        }

        //判断邀请码是否存在
        if (countInvite != 0){
            return AppResponse.notFound("邀请码已存在");
        }
        shopInfo.setShopId(StringUtil.getCommonCode(2));
        int count = shopDao.saveShop(shopInfo);
        if(count == 0){
            return AppResponse.success("新增失败");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 省市区下拉查询
     * @return
     */
    public AppResponse listArea(String id){
        List<DictionariesInfo> provinceList=shopDao.listArea(id);
        return AppResponse.success("查询成功",provinceList);
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

    /**
     * 更新门店信息
     * @param shopInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShop(ShopInfo shopInfo){
        int countShop = shopDao.countShop(shopInfo);
        //判断编号是否存在
        if (countShop == 0){
            return AppResponse.notFound("编号不存在,请重新输入");
        }
        ShopInfo shopInfo1 = shopDao.queryShop(shopInfo.getShopId());
        //判断是否修改营业执照
        if(!shopInfo1.getLicense().equals(shopInfo.getLicense())){
            int countLicense = shopDao.countLicense(shopInfo);
            //判断营业执照是否存在
            if(countLicense != 0){
                return AppResponse.notFound("营业执照已存在");
            }
        }
        //判断是否修改邀请码
        if(!shopInfo1.getInviteCode().equals(shopInfo.getInviteCode())){
            int countInvite = shopDao.countInvite(shopInfo);
            //判断邀请码是否存在
            if (countInvite != 0){
                return AppResponse.notFound("邀请码已存在");
            }
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
        if(count == 0){
            return AppResponse.versionError("版本错误,删除失败");
        }
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
