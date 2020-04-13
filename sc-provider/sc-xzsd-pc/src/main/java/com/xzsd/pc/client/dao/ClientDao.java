package com.xzsd.pc.client.dao;




import com.xzsd.pc.client.entity.ClientInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DemoDao
 * @Description Demo
 * @Author dingning
 * @Date 2020-03-21
 */
@Mapper
public interface ClientDao {
//    /**
//     * 统计用户账号数量
//     * @param userInfo 用户信息
//     * @return
//     */
//    int countUserAcct(ClientInfo userInfo);
//
//    /**
//     * 新增用户
//     * @param userInfo 用户信息
//     * @return
//     */
//    int saveUser(ClientInfo userInfo);

    /**
     * 获取所有用户信息
     * @param clientInfo 用户信息
     * @return 所有用户信息
     */
    List<ClientInfo> listClientsByPage(ClientInfo clientInfo);

//    /**
//     * 删除用户信息
//     * @param listCode 选中的用户编号集合
//     * @param userId 更新人
//     * @return
//     */
//    int deleteUser(List<String> listCode, String userId);
//
//    /**
//     * 修改用户信息
//     * @param userInfo 用户信息
//     * @return 修改结果
//     */
//    int updateUser(ClientInfo userInfo);
//
//    /**
//     * 查询用户信息
//     * @param userCode 用户编号
//     * @return 修改结果
//     */
//    int saveClient(ClientInfo userCode);
//    ClientInfo getClientByUserCode(String userCode);
//    int deleteClient(@Param("listCode") List<String> listCode);
//    int updateClient(ClientInfo clientInfo);


}
