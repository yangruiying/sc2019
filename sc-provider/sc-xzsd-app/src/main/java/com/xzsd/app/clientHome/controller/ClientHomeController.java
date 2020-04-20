package com.xzsd.app.clientHome.controller;

import com.xzsd.app.clientHome.service.ClientHomeService;
import com.xzsd.app.util.AppResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("clientHome")
public class ClientHomeController {
    @Resource
    private ClientHomeService clientHomeService;

    /**
     * 首页轮播图
     * @return
     */
    @RequestMapping(value = "listRotationCharHome")
    public AppResponse listRotationCharHome(){
        return clientHomeService.listRotationCharHome();
    }

    /**
     * 热门商品
     * @return
     */
    @RequestMapping(value = "listHotGoods")
    public AppResponse listHotGoods(){
        return clientHomeService.listHotGoods();
    }
}
