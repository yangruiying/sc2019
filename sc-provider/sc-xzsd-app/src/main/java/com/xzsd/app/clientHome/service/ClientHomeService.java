package com.xzsd.app.clientHome.service;

import com.xzsd.app.clientHome.dao.ClientHomeDao;
import com.xzsd.app.clientHome.entity.ClientHomeInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClientHomeService {
    @Resource
    private ClientHomeDao clientHomeDao;

    /**
     * 首页轮播图
     * @return
     */
    public AppResponse listRotationCharHome(){
        List<ClientHomeInfo> clientHomeInfo = clientHomeDao.listRotationCharHome();
        return AppResponse.success("查询成功",clientHomeInfo);
    }

    /**
     * 热门商品
     * @return
     */
    public AppResponse listHotGoods(){
        List<ClientHomeInfo> clientHomeInfo = clientHomeDao.listHotGoods();
        return AppResponse.success("查询成功",clientHomeInfo);
    }
}
