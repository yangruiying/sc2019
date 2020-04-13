package com.xzsd.pc.hotGoods.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.hotGoods.entity.HotGoodsInfo;
import com.xzsd.pc.hotGoods.service.HotGoodsService;
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

    @PostMapping("deleteHotGoods")
    public AppResponse deleteHotGoods(String hId){
        return hotGoodsService.deleteHotGoods(hId);
    }

    @RequestMapping(value = "listGoods")
    public AppResponse listGoods(HotGoodsInfo hotGoodsInfo){
        return hotGoodsService.listGoods(hotGoodsInfo);
    }
}