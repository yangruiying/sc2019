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

    @PostMapping("listScroll")
    public AppResponse listScroll(ScrollInfo scrollInfo){
        return scrollService.listScroll(scrollInfo);
    }

    @PostMapping("deleteScroll")
    public AppResponse deleteScroll(String pId){
        return scrollService.deleteScroll(pId);
    }

    @PostMapping("stateGoods")
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        return scrollService.stateGoods(scrollInfo);
    }

    @PostMapping("saveScroll")
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        return scrollService.saveScroll(scrollInfo);
    }


}
