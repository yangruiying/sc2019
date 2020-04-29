package com.xzsd.app.imageUpload.controller;

import com.neusoft.core.restful.AppResponse;

import com.xzsd.app.imageUpload.service.UpLoadService;
import com.xzsd.app.managerInformation.controller.ManagerInformationController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("imageUpload")
public class UpLoadController {
    @Resource
    private UpLoadService upLoadService;
    private static final Logger logger = LoggerFactory.getLogger(UpLoadController.class);
    @RequestMapping(value = "uploadImage")
    AppResponse uploadImage(MultipartFile imageFile){
        try {
            return upLoadService.upLoadImage(imageFile);
        }catch (Exception e) {
            logger.error("更新错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
