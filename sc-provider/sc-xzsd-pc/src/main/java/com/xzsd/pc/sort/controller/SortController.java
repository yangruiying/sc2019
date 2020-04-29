package com.xzsd.pc.sort.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.sort.entity.SortInfo;
import com.xzsd.pc.sort.service.SortService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sort")
public class SortController {
    @Resource
    private SortService sortService;
    private static final Logger logger = LoggerFactory.getLogger(SortController.class);
    /**
     * 分类查询
     * @return
     */
    @RequestMapping(value = "listSort")
    public AppResponse getNodeTree(){
        try {
            return sortService.getNodeTree();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增分类
     * @param sortInfo
     * @return
     */
    @PostMapping("saveSort")
    public AppResponse saveSort(SortInfo sortInfo){
        try {
            return sortService.saveSort(sortInfo);
        }catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 更新分类
     * @param sortInfo
     * @return
     */
    @PostMapping("updateSort")
    public AppResponse updateSort(SortInfo sortInfo){
        try {
            return sortService.updateSort(sortInfo);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除分类
     * @param sortId
     * @return
     */
    @PostMapping("deleteSort")
    public AppResponse deleteSort(String sortId){
        try {
            return sortService.deleteSort(sortId);
        }catch (Exception e) {
            logger.error("删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 分类详情
     * @param sortId
     * @return
     */
    @RequestMapping(value = "querySort")
    public AppResponse querySort(String sortId){
        try {
            return sortService.querySort(sortId);
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
