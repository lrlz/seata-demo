package com.lrlz.demo.seata.shardingsphere.order.web.controller;

import com.google.common.collect.Lists;
import com.lrlz.demo.seata.shardingsphere.order.entity.OrderEntity;
import com.lrlz.demo.seata.shardingsphere.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/insertBatch")
    public void insertBatch() {
        List<OrderEntity> list = Lists.newArrayList();
        for (int i = 0; i < 100; i++){
            OrderEntity entity = new OrderEntity();
            entity.setOrderId(i);
            entity.setUserId(123456);
            entity.setStatus("0");
            list.add(entity);
        }
        orderService.saveBatch(list);
    }

}
