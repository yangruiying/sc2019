package com.xzsd.pc.hotGoods.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.hotGoods.dao.HotGoodsDao;
import com.xzsd.pc.hotGoods.entity.HotGoodsInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class HotGoodsService {
    @Resource
    private HotGoodsDao hotGoodsDao;
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveHotGoods(HotGoodsInfo hotGoodsInfo){
        int countHotGoods = hotGoodsDao.countHotGoods(hotGoodsInfo);
        if (0 != countHotGoods)
        {
            return AppResponse.success("编号已存在");
        }
        hotGoodsInfo.sethId(StringUtil.getCommonCode(2));
        int count=hotGoodsDao.saveHotGoods(hotGoodsInfo);
        if (0 ==count)
        {
            return AppResponse.success("新增失败，请重试！");
        }
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