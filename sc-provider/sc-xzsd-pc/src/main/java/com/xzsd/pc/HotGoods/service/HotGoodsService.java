package com.xzsd.pc.HotGoods.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.HotGoods.dao.HotGoodsDao;
import com.xzsd.pc.HotGoods.entity.HotGoodsInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class HotGoodsService {
    @Resource
    private HotGoodsDao hotGoodsDao;

    public AppResponse saveHotGoods(HotGoodsInfo hotGoodsInfo){
        hotGoodsInfo.sethId(StringUtil.getCommonCode(2));
        hotGoodsDao.saveHotGoods(hotGoodsInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo){
        hotGoodsDao.updateHotGoods((hotGoodsInfo));
        return AppResponse.success("修改成功");
    }

    public AppResponse deleteHotGoods(String hId){
        List<String> hotGoodsList = Arrays.asList(hId.split(","));
        hotGoodsDao.deleteHotGoods(hotGoodsList);
        return AppResponse.success("删除成功");
    }

    public AppResponse listGoods(HotGoodsInfo hotGoodsInfo){
        HotGoodsInfo hotGoodsList=hotGoodsDao.listGoodsByPage(hotGoodsInfo);
        return AppResponse.success("查询成功",getPageInfo(hotGoodsList));
    }
}
