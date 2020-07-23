package com.lrlz.demo.seata.shardingsphere.order.dubbo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lrlz.demo.seata.shardingsphere.order.api.OrderDubboService;
import com.lrlz.demo.seata.shardingsphere.order.entity.OrderEntity;
import com.lrlz.demo.seata.shardingsphere.order.service.IOrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderDubboServiceImpl implements OrderDubboService {

    @Autowired
    private IOrderService orderService;

//    @Override
//    public OrderEntity getOrder(Long ordreId) {
//        QueryWrapper<OrderEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().eq(OrderEntity::getOrderId, ordreId);
//        return orderService.getOne(queryWrapper);
//    }

    @Override
    public void save(Long ordreId) {
        OrderEntity entity = new OrderEntity();
        entity.setStatus("10");
        entity.setOrderId(ordreId);
        entity.setUserId(123456);
        orderService.saveOrUpdate(entity);
        return;
    }


}
