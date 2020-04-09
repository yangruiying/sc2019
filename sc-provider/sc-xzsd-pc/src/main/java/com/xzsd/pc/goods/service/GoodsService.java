package com.xzsd.pc.goods.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.JsonUtils;
import com.xzsd.pc.goods.dao.GoodsDao;
import com.xzsd.pc.goods.entity.GoodsInfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

@Service
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;
//    @Resource
//    RedisOperator redis;




    /**
     * 商品列表查询
     * @param goodsInfo
     * @return
     */
//    public AppResponse listGoods(GoodsInfo goodsInfo){
//        PageHelper.startPage(goodsInfo.getPageNum(), goodsInfo.getPageSize());
//        // 包装Page对象
//        PageInfo<GoodsInfo> pageData = null;
//        String jsonStr=null;
//        //将查询的信息整合成一条字符串
//        String strKey = goodsInfo.getCname()+goodsInfo.getPageNum();
//        //如果redis中有相同的数据说明5分钟内进行相同查询，进行redis查询，否则进行数据库查询
//        if(redis.get(strKey)!=null){
//            //在redis中调出查询数据
//            jsonStr=redis.get(strKey);
//            //将json格式转化为对象格式
//            pageData=JsonUtils.fromJson(jsonStr, new PageInfo<GoodsInfo>().getClass());
//            return AppResponse.success("redis查询成功！", pageData);
//        }else{
//            //调用数据库查询
//            List<GoodsInfo> goodInfoList = goodsDao.listGoodsByPage(goodsInfo);
//            pageData = new PageInfo<GoodsInfo>(goodInfoList);
//            //将对象转化为json字符串
//            jsonStr=JsonUtils.toJson(pageData);
//            //将查询的字符串作为key，查询出来的结果作为value，有效时间设为300（5分钟），存入redis中
//            redis.set(strKey,jsonStr,300);
//            pageData=JsonUtils.fromJson(jsonStr,pageData.getClass());
//            return AppResponse.success("数据库查询成功！", pageData);
//        }
//
//    }
//    @Autowired
//    private ProducerController producerController;

    public AppResponse listGoods(GoodsInfo goodsInfo){
        //PageHelper.startPage(goodsInfo.getPageNum(),goodsInfo.getPageSize());
        List<GoodsInfo> goodsInfoList=goodsDao.listGoodsByPage(goodsInfo);
        //PageInfo<GoodsInfo> pageData = new PageInfo<>(goodsInfoList);
        return AppResponse.success("查询成功",getPageInfo(goodsInfoList));

    }


    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveGoods(GoodsInfo goodsInfo){
        //将商品实体类转化为json
        String jsonStr= JsonUtils.toJson(goodsInfo);
        //将json传入ActiveMQ中
        //producerController.sendQueue(jsonStr);
        goodsDao.saveGoods(goodsInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse getGoodsById(String Cid){
        GoodsInfo goodsInfo=goodsDao.getGoodsById(Cid);
        return AppResponse.success("查询成功",goodsInfo);
    }

    public AppResponse deleteGoods(String Cid){
        List<String> codeList= Arrays.asList(Cid.split(","));
        goodsDao.deleteGoods(codeList);
        return AppResponse.success("删除成功");
    }
}
