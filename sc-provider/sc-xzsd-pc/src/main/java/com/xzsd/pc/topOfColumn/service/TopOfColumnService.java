package com.xzsd.pc.topOfColumn.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.AuthUtils;
import com.xzsd.pc.topOfColumn.dao.TopOfColumnDao;
import com.xzsd.pc.topOfColumn.entity.TopOfColumnInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TopOfColumnService {
    @Resource
    private TopOfColumnDao topOfColumnDao;

    /**
     * 获取顶部信息
     * @return
     */
    public AppResponse getTopOfColumn(){
        String id =  SecurityUtils.getCurrentUserId();
        TopOfColumnInfo topOfColumnInfo = topOfColumnDao.getTopOfColumn(id);
        return AppResponse.success("查询成功",topOfColumnInfo);
    }
}
