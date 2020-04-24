package com.xzsd.app.clientOrder.service;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.clientOrder.dao.ClientOrderDao;
import com.xzsd.app.clientOrder.entity.ClientOrderInfo;
import com.xzsd.app.clientOrder.entity.FirstInfo;
import com.xzsd.app.clientOrder.entity.QueryInfo;
import com.xzsd.app.clientShopCart.dao.ClientShopCartDao;
import com.xzsd.app.util.AppResponse;
import com.xzsd.app.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class ClientOrderService {
    @Resource
    private ClientOrderDao clientOrderDao;

    /**
     * 新增订单
     * @param cId
     * @param goodsCount
     * @param shopId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addOrder(String cId,String goodsCount,String shopId){
        List<String> cIdList = Arrays.asList(cId.split(","));
        List<String> goodsCountList = Arrays.asList(goodsCount.split(","));
        List<ClientOrderInfo> clientOrderInfoList = new ArrayList<>();
        String userId = SecurityUtils.getCurrentUserId();
        for (int i = 0 ; i < cIdList.size() ; i++){
            String orderId = StringUtil.getCommonCode(2);
            ClientOrderInfo clientOrderInfo = new ClientOrderInfo();
            clientOrderInfo.setOrderId(orderId);
            clientOrderInfo.setcId(cIdList.get(i));
            clientOrderInfo.setGoodsCount(goodsCountList.get(i));
            clientOrderInfoList.add(clientOrderInfo);
        }
        clientOrderDao.addOrder(clientOrderInfoList,userId,shopId);
        //清空购物车
        int count = clientOrderDao.clearCart(cIdList,userId);
        if (count == 0){
            return AppResponse.versionError("新增失败");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 订单查询
     * @param clientOrderInfo
     * @return
     */
    public AppResponse listOrder(ClientOrderInfo clientOrderInfo){
        String userId = SecurityUtils.getCurrentUserId();
        clientOrderInfo.setUserId(userId);
        List<FirstInfo> orderList = clientOrderDao.listOrderByPage(clientOrderInfo);
        return AppResponse.success("查询成功",getPageInfo(orderList));
    }

    /**
     * 订单状态修改
     * @param clientOrderInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderState(ClientOrderInfo clientOrderInfo){
        int count = clientOrderDao.updateOrderState(clientOrderInfo);
        if (count == 0){
            return AppResponse.notFound("修改失败");
        }
        return AppResponse.success("修改成功");
    }

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    public AppResponse listOrderDeepen(String orderId){
        QueryInfo queryInfo = clientOrderDao.listOrderDeepen(orderId);
        return AppResponse.success("查询成功",queryInfo);
    }

    /**
     * 查询订单评价商品信息列表接口
     * @param orderId
     * @return
     */
    public AppResponse listGoodsForEvaluate(String orderId){
        List<ClientOrderInfo> clientOrderInfoList = clientOrderDao.listGoodsForEvaluate(orderId);
        return AppResponse.success("查询成功",clientOrderInfoList);
    }

    /**
     * 新增商品评价
     * @param clientOrderInfo
     * @return
     */
    public AppResponse addGoodsEvaluate(ClientOrderInfo clientOrderInfo){
        //ClientOrderInfo orderInfo
        String userId = SecurityUtils.getCurrentUserId();
        JSONObject json = JSONObject.parseObject(clientOrderInfo.getEvaluateList());
        ClientOrderInfo list = new ClientOrderInfo();
        List<ClientOrderInfo> firstList = new ArrayList<>();
        for (int i = 0 ; i < json.getJSONArray("evaluateList").size() ; i++){
            ClientOrderInfo evaluateList = new ClientOrderInfo();
            List<ClientOrderInfo> secondList = new ArrayList<>();
            String cId = json.getJSONArray("evaluateList").getJSONObject(i).getString("cId");
            String info = json.getJSONArray("evaluateList").getJSONObject(i).getString("info");
            String grade = json.getJSONArray("evaluateList").getJSONObject(i).getString("grade");
            evaluateList.setcId(cId);
            evaluateList.setInfo(info);
            evaluateList.setGrade(grade);
            System.out.println(json.getJSONArray("evaluateList").getJSONObject(i).getString("cId"));
            for (int j = 0 ; j < json.getJSONArray("evaluateList").getJSONObject(i).getJSONArray("imageList").size() ; j++){
                ClientOrderInfo imageList = new ClientOrderInfo();
                String imageNum = json.getJSONArray("evaluateList").getJSONObject(i).getJSONArray("imageList").getJSONObject(j).getString("imageNum");
                String imagePath = json.getJSONArray("evaluateList").getJSONObject(i).getJSONArray("imageList").getJSONObject(j).getString("imagePath");
                imageList.setImageNum(imageNum);
                imageList.setImagePath(imagePath);
                secondList.add(imageList);
                System.out.println(json.getJSONArray("evaluateList").getJSONObject(i).getJSONArray("imageList").getJSONObject(j).getString("imageNum"));
            }
            evaluateList.setEvaluate(secondList);
            firstList.add(evaluateList);
        }
        System.out.println(firstList.get(0).getEvaluate().get(0).getImageNum());
        //System.out.println(json.getJSONArray("imageList").getJSONObject(0)+"aaa");
        int count = clientOrderDao.addGoodsEvaluate(firstList,userId);
        //修改商品星级
        int count2 = clientOrderDao.changeGrade();
        if (count == 0 || count2 ==0){
            return AppResponse.versionError("新增失败");
        }
        return AppResponse.success("新增成功");
    }
}
