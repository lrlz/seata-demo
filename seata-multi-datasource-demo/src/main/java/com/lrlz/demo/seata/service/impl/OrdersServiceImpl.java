package com.lrlz.demo.seata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lrlz.demo.seata.entity.Orders;
import com.lrlz.demo.seata.mapper.OrdersMapper;
import com.lrlz.demo.seata.service.IOrdersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lrlz
 * @since 2020-07-10
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
