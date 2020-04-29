package com.xzsd.pc.topOfColumn.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.topOfColumn.service.TopOfColumnService;
import com.xzsd.pc.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/topOfColumn")
public class TopOfColumnController {
    @Resource
    private TopOfColumnService topOfColumnService;
    private static final Logger logger = LoggerFactory.getLogger(TopOfColumnController.class);

    /**
     * 获取顶部信息
     * @return
     */
    @RequestMapping(value = "getTopOfColumn")
    public AppResponse getTopOfColumn(){
        try {
            return topOfColumnService.getTopOfColumn();
        }catch (Exception e) {
            logger.error("查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
