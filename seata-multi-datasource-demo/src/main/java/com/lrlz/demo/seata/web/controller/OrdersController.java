package com.lrlz.demo.seata.web.controller;


import com.lrlz.demo.seata.entity.Orders;
import com.lrlz.demo.seata.service.IOrdersService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lrlz
 * @since 2020-07-10
 */
@RestController
@RequestMapping("/orders")
@Api
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @GetMapping("")
    public void create() {
        Orders entity = new Orders();
        entity.setProductId(233);
        entity.setStatus("20");
        ordersService.save(entity);
    }

}

