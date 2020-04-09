package com.xzsd.pc.sort.service;


import com.neusoft.core.restful.AppResponse;

import com.xzsd.pc.sort.dao.SortDao;
import com.xzsd.pc.sort.entity.SortInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SortService {
    @Resource
    private SortDao sortDao;
    public AppResponse getNodeTree(){
        List<SortInfo> sortlist =sortDao.getNodeTree();
        return AppResponse.success("查询成功",sortlist);
    }


    public AppResponse saveSort(SortInfo sortInfo){
        sortDao.saveSort(sortInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse updateSort(SortInfo sortInfo){
        sortDao.updateSort(sortInfo);
        return AppResponse.success("更新成功");
    }
}
