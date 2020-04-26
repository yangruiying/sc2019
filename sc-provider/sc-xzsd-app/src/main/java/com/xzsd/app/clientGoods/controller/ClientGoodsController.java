package com.xzsd.app.clientGoods.controller;

import com.xzsd.app.clientGoods.entity.ClientGoodsInfo;
import com.xzsd.app.clientGoods.service.ClientGoodsService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/clientGoods")
public class ClientGoodsController {
    @Resource
    private ClientGoodsService clientGoodsService;

    /**
     * 查找商品详情
     * @param cId
     * @return
     */
    @RequestMapping(value = "getGoods")
    public AppResponse getGoods(String cId){
        return clientGoodsService.getGoods(cId);
    }

    /**
     * 查找一级分类
     * @return
     */
    @RequestMapping(value = "listOneGoodsClassify")
    public AppResponse listOneGoodsClassify(){
        return clientGoodsService.listOneGoodsClassify();
    }

    /**
     * 二级分类及商品信息
     * @param sortId
     * @return
     */
    @RequestMapping(value = "listGetClassGoods")
    public AppResponse getNodeTree(String sortId){
        return clientGoodsService.getNodeTree(sortId);
    }

    /**
     * 商品评价列表
     * @param clientGoodsInfo
     * @return
     */
    @RequestMapping("listGoodsEvaluates")
    public AppResponse listGoodsEvaluates(ClientGoodsInfo clientGoodsInfo){
        return clientGoodsService.listGoodsEvaluates(clientGoodsInfo);
    }
}
