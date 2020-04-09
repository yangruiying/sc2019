package com.xzsd.pc.sort.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.sort.entity.SortInfo;
import com.xzsd.pc.sort.service.SortService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sort")
public class SortController {
    @Resource
    private SortService sortService;

    @RequestMapping(value = "getNodeTree")
    public AppResponse getNodeTree(){
        return sortService.getNodeTree();
    }
    @PostMapping("saveSort")
    public AppResponse saveSort(SortInfo sortInfo){
        return sortService.saveSort(sortInfo);
    }
    @PostMapping("updateSort")
    public AppResponse updateSort(SortInfo sortInfo){
        return sortService.updateSort(sortInfo);
    }
}
