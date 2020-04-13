package com.xzsd.pc.goods.controller;

import com.neusoft.core.restful.AppResponse;
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
        return goodsService.saveGoods(goodsInfo);
    }

    /**
     * 查询商品
     * @param Cid
     * @return
     */
    @PostMapping("getGoodsById")
    public AppResponse getGoodsById(String Cid){
        return goodsService.getGoodsById(Cid);
    }

    /**
     * 删除商品
     * @param Cid
     * @return
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String Cid){
        return goodsService.deleteGoods(Cid);
    }
}
