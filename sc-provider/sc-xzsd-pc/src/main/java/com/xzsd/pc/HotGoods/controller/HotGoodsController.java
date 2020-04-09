package com.xzsd.pc.HotGoods.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.HotGoods.entity.HotGoodsInfo;
import com.xzsd.pc.HotGoods.service.HotGoodsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("HotGoods")
public class HotGoodsController {
    @Resource
    private HotGoodsService hotGoodsService;

    @PostMapping("saveHotGoods")
    public AppResponse saveHotGoods(HotGoodsInfo hotGoodsInfo){
        return hotGoodsService.saveHotGoods(hotGoodsInfo);
    }

    @PostMapping("updateHotGoods")
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo){
        return hotGoodsService.updateHotGoods(hotGoodsInfo);
    }
}
