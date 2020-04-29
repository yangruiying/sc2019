package com.xzsd.app.clientGoods.controller;

import com.xzsd.app.clientGoods.entity.ClientGoodsInfo;
import com.xzsd.app.clientGoods.service.ClientGoodsService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import com.xzsd.app.util.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/clientGoods")
public class ClientGoodsController {
    @Resource
    private ClientGoodsService clientGoodsService;
    private static final Logger logger = LoggerFactory.getLogger(ClientGoodsController.class);
    /**
     * 查找商品详情
     * @param cId
     * @return
     */
    @RequestMapping(value = "getGoods")
    public AppResponse getGoods(String cId){
        try {
            return clientGoodsService.getGoods(cId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查找一级分类
     * @return
     */
    @RequestMapping(value = "listOneGoodsClassify")
    public AppResponse listOneGoodsClassify(){
        try {
            return clientGoodsService.listOneGoodsClassify();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 二级分类及商品信息
     * @param sortId
     * @return
     */
    @RequestMapping(value = "listGetClassGoods")
    public AppResponse getNodeTree(String sortId){
        try {
            return clientGoodsService.getNodeTree(sortId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 商品评价列表
     * @param clientGoodsInfo
     * @return
     */
    @RequestMapping("listGoodsEvaluates")
    public AppResponse listGoodsEvaluates(ClientGoodsInfo clientGoodsInfo){
        try {
            return clientGoodsService.listGoodsEvaluates(clientGoodsInfo);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
