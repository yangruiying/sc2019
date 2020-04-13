package com.xzsd.pc.scroll.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import com.xzsd.pc.scroll.service.ScrollService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/scroll")
public class ScrollController {
    @Resource
    private ScrollService scrollService;

    /**
     * 轮播图列表查询
     * @param scrollInfo
     * @return
     */
    @PostMapping("listScroll")
    public AppResponse listScroll(ScrollInfo scrollInfo){
        return scrollService.listScroll(scrollInfo);
    }

    /**
     * 删除轮播图
     * @param pId
     * @return
     */
    @PostMapping("deleteScroll")
    public AppResponse deleteScroll(String pId){
        return scrollService.deleteScroll(pId);
    }

    /**
     * 商品状态修改
     * @param scrollInfo
     * @return
     */
    @PostMapping("stateGoods")
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        return scrollService.stateGoods(scrollInfo);
    }

    /**
     * 新增轮播图
     * @param scrollInfo
     * @return
     */
    @PostMapping("saveScroll")
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        return scrollService.saveScroll(scrollInfo);
    }


}
