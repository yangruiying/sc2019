package com.xzsd.pc.scroll.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;

import com.neusoft.util.StringUtil;
import com.xzsd.pc.scroll.dao.ScrollDao;
import com.xzsd.pc.scroll.entity.ScrollInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class ScrollService {
    @Resource
    private ScrollDao scrollDao;

    /**
     * 轮播图列表
     * @param scrollInfo
     * @return
     */
    public AppResponse listScroll(ScrollInfo scrollInfo){
        PageHelper.startPage(scrollInfo.getPageNum(),scrollInfo.getPageSize());
        List<ScrollInfo> scrolllist=scrollDao.listScroll(scrollInfo);
        PageInfo<ScrollInfo> pageDate = new PageInfo<>(scrolllist);
        return AppResponse.success("查询成功",pageDate);
    }

    /**
     * 删除轮播图
     * @param Pid
     * @return
     */
    public AppResponse deleteScroll(String Pid){
        List<String> scrollList = Arrays.asList(Pid.split(","));
        scrollDao.deleteScroll(scrollList);
        return AppResponse.success("删除成功");
    }

    /**
     * 商品状态修改
     * @param scrollInfo
     * @return
     */
    public AppResponse stateGoods(ScrollInfo scrollInfo){
        scrollDao.stateGoods(scrollInfo);
        return AppResponse.success("修改成功");
    }

    /**
     * 新增轮播图
     * @param scrollInfo
     * @return
     */
    public AppResponse saveScroll(ScrollInfo scrollInfo){
        scrollInfo.setpId(StringUtil.getCommonCode(2));
        scrollDao.saveScroll(scrollInfo);
        return AppResponse.success("新增成功");
    }


}
