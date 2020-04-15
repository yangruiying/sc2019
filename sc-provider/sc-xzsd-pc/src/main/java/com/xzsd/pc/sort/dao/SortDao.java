package com.xzsd.pc.sort.dao;

import com.xzsd.pc.scroll.entity.ScrollInfo;
import com.xzsd.pc.sort.entity.SortInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SortDao {
    List<SortInfo> getNodeTree();
    int saveSort(SortInfo sortInfo);
    int updateSort(SortInfo sortInfo);

    /**
     * 查询子项数量
     * @param sortId
     * @return
     */
    int countSort(String sortId);

    /**
     * 删除分类
     * @param sortId
     * @return
     */
    int deleteSort(String sortId);

    /**
     * 分类详情
     * @param sortId
     * @return
     */
    SortInfo querySort(String sortId);
}
