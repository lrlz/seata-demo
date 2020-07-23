package com.lrlz.demo.seata.shardingsphere.order.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lrlz.demo.seata.shardingsphere.order.entity.OrderItemEntity;
import com.lrlz.demo.seata.shardingsphere.order.mapper.OrderItemMapper;
import com.lrlz.demo.seata.shardingsphere.order.service.IOrderItemService;
import org.springframework.stereotype.Service;


@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItemEntity> implements IOrderItemService {


}
