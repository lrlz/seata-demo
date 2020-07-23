package com.lrlz.demo.seata.shardingsphere.business.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeataConfig {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("sharding-mybatis-plus-business", "sharding-mybatis-plus-business_group");
    }

}
