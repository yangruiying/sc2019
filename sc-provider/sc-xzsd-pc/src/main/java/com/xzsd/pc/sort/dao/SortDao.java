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
}
