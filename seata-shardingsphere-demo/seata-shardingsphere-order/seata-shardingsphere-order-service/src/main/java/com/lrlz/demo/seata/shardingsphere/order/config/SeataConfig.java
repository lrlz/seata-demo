package com.lrlz.demo.seata.shardingsphere.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeataConfig {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("sharding-mybatis-plus-order", "sharding-mybatis-plus-order_group");
    }

}
