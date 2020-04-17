package com.xzsd.pc.goods.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.goods.entity.GoodsInfo;
import com.xzsd.pc.goods.service.GoodsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    /**
     * 商品列表
     * @param goodsInfo
     * @return
     */
    @RequestMapping(value = "goodsList")
    public AppResponse goodsList(GoodsInfo goodsInfo){
        return goodsService.listGoods(goodsInfo);
    }

    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */
    @PostMapping("saveGoods")
    public AppResponse saveGoods(GoodsInfo goodsInfo){
        String id = SecurityUtils.getCurrentUserId();;
        goodsInfo.setCreateBy(id);
        return goodsService.saveGoods(goodsInfo);
    }

    /**
     * 查询商品
     * @param cId
     * @return
     */
    @PostMapping("queryGoods")
    public AppResponse queryGoods(String cId){
        return goodsService.queryGoods(cId);
    }

    /**
     * 删除商品
     * @param cId
     * @return
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String cId){
        return goodsService.deleteGoods(cId);
    }

    /**
     * 更新商品
     * @param goodsInfo
     * @return
     */
    @PostMapping("updateGoods")
    public AppResponse updateGoods(GoodsInfo goodsInfo){
        return goodsService.updateGoods(goodsInfo);
    }

    @RequestMapping(value = "listGoodsClassify")
    public AppResponse listGoodsClassify(String sortId){
        return goodsService.listGoodsClassify(sortId);
    }

    /**
     * 更新商品状态
     * @param cId
     * @param state
     * @return
     */
    @PostMapping("goodsState")
    public AppResponse goodsState(String cId,String version,int state){
        return goodsService.goodsState(cId,version,state);
    }
}
