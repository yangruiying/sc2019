package com.xzsd.pc.scroll.dao;


import com.xzsd.pc.scroll.entity.ScrollInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScrollDao {
    List<ScrollInfo> listScroll(ScrollInfo scrollInfo);

    int deleteScroll(@Param("scrollList") List<String> scrollList);

    int stateGoods(ScrollInfo scrollInfo);

    int saveScroll(ScrollInfo scrollInfo);


}
