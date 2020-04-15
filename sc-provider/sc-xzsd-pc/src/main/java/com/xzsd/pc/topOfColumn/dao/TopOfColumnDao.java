package com.xzsd.pc.topOfColumn.dao;

import com.xzsd.pc.topOfColumn.entity.TopOfColumnInfo;

public interface TopOfColumnDao {
    /**
     * 获取顶部栏信息
     * @param id
     * @return
     */
    TopOfColumnInfo getTopOfColumn(String id);
}
