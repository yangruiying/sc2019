package com.xzsd.pc.topOfColumn.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.topOfColumn.service.TopOfColumnService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/TopOfColumn")
public class TopOfColumnController {
    @Resource
    private TopOfColumnService topOfColumnService;

    @RequestMapping(value = "getTopOfColumn")
    public AppResponse getTopOfColumn(){
        return topOfColumnService.getTopOfColumn();
    }
}
