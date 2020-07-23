package com.lrlz.demo.seata.shardingsphere.business.service;


import com.lrlz.demo.seata.shardingsphere.order.api.OrderDubboService;
import io.seata.core.context.RootContext;
import io.seata.core.rpc.RpcContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BusinessService {

    @Reference
    private OrderDubboService orderDubboService;

    @GlobalTransactional
    public void insert(Long orderId) {
        log.info("start GlobalTransactional with xid:{}", RootContext.getXID());
        orderDubboService.save(orderId);
        throw new RuntimeException("rollback");
    }


}
