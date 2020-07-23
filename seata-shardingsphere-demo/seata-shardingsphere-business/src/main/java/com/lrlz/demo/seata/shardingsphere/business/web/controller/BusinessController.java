package com.lrlz.demo.seata.shardingsphere.business.web.controller;

import com.lrlz.demo.seata.shardingsphere.business.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping("/insert")
    public void insertBatch(@RequestParam("orderId") Long orderId) {
        businessService.insert(orderId);
    }

}
