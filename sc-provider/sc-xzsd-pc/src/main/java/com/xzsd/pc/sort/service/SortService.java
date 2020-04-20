package com.xzsd.pc.sort.service;


import com.neusoft.core.restful.AppResponse;

import com.neusoft.util.StringUtil;
import com.xzsd.pc.sort.dao.SortDao;
import com.xzsd.pc.sort.entity.SortInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SortService {
    @Resource
    private SortDao sortDao;

    /**
     * 分类查询
     * @return
     */
    public AppResponse getNodeTree(){
        List<SortInfo> sortlist =sortDao.getNodeTree();
        return AppResponse.success("查询成功",sortlist);
    }

    /**
     * 新增分类
     * @param sortInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveSort(SortInfo sortInfo){
        String sortId = StringUtil.getCommonCode(2);
        sortInfo.setSortId(sortId);
        sortDao.saveSort(sortInfo);
        return AppResponse.success("新增成功");
    }

    /**
     * 更新分类
     * @param sortInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateSort(SortInfo sortInfo){
        sortDao.updateSort(sortInfo);
        return AppResponse.success("更新成功");
    }

    /**
     * 删除分类
     * @param sortId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteSort(String sortId){
        int countSort = sortDao.countSort(sortId);
        //查询下级分类
        if (countSort != 0){
            return AppResponse.notFound("有下级分类,删除失败");
        }
        int count = sortDao.deleteSort(sortId);
        if (count == 0){
            return AppResponse.versionError("版本错误,删除失败");
        }
        return AppResponse.success("删除成功");
    }

    /**
     * 分类详情
     * @param sortId
     * @return
     */
    public AppResponse querySort(String sortId){
        SortInfo sortInfo = sortDao.querySort(sortId);
        return AppResponse.success("查询成功",sortInfo);
    }
}
