package com.lrlz.demo.seata.shardingsphere.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lrlz.demo.seata.shardingsphere.order.entity.OrderEntity;
import com.lrlz.demo.seata.shardingsphere.order.mapper.OrderMapper;
import com.lrlz.demo.seata.shardingsphere.order.service.IOrderService;


@org.springframework.stereotype.Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements IOrderService {

}
