package com.xzsd.app.manangerOrder.service;

import com.xzsd.app.manangerOrder.dao.ManangerOrderDao;
import com.xzsd.app.manangerOrder.entity.ManangerOrderInfo;
import com.xzsd.app.user.dao.UserDao;
import com.xzsd.app.user.entity.UserInfo;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class ManangerOrderService {
    @Resource
    private ManangerOrderDao manangerOrderDao;

    /**
     * 店长订单列表
     * @param orderId
     * @return
     */
    public AppResponse listManagerOrders(String orderId){
        List<ManangerOrderInfo> manangerOrderInfoList = manangerOrderDao.listManagerOrdersByPage(orderId);
        return AppResponse.success("查询成功",getPageInfo(manangerOrderInfoList));
    }

    /**
     * 店长订单状态修改
     * @param manangerOrderInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateManangerOrderState(ManangerOrderInfo manangerOrderInfo){
        int count = manangerOrderDao.updateManangerOrderState(manangerOrderInfo);
        if (count == 0){
            return AppResponse.versionError("版本错误,更新失败");
        }
        return AppResponse.success("更新成功");
    }

    /**
     * 店长订单查询
     * @param orderId
     * @return
     */
    public AppResponse listManagerOrderDeepen(String orderId){
        ManangerOrderInfo manangerOrderInfo = manangerOrderDao.listManagerOrderDeepen(orderId);
        return AppResponse.success("查询成功",manangerOrderInfo);
    }


}
