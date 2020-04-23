package com.xzsd.app.managerInformation.dao;

import com.xzsd.app.managerInformation.entity.ManagerInformationInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerInformationDao {
    /**
     * 查询店长门下的司机信息接口
     * @param userId
     * @return
     */
    List<ManagerInformationInfo> listManagerDrivers(String userId);
}
