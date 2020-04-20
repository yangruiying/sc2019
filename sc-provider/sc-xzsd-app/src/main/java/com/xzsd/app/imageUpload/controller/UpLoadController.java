package com.xzsd.app.imageUpload.controller;

import com.neusoft.core.restful.AppResponse;

import com.xzsd.app.imageUpload.service.UpLoadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("imageUpload")
public class UpLoadController {
    @Resource
    private UpLoadService upLoadService;

    @RequestMapping(value = "uploadImage")
    AppResponse uploadImage(MultipartFile imageFile){
        return upLoadService.upLoadImage(imageFile);
    }
}
