package com.xzsd.pc.HotGoods.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.HotGoods.dao.HotGoodsDao;
import com.xzsd.pc.HotGoods.entity.HotGoodsInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HotGoodsService {
    @Resource
    private HotGoodsDao hotGoodsDao;

    public AppResponse saveHotGoods(HotGoodsInfo hotGoodsInfo){
        hotGoodsInfo.sethId(StringUtil.getCommonCode(2));
        hotGoodsDao.saveHotGoods(hotGoodsInfo);
        return AppResponse.success("新增成功");
    }
}
