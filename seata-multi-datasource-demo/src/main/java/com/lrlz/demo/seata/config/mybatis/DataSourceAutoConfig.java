package com.lrlz.demo.seata.config.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceAutoConfig {

    @Bean("orderDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.order")
    public DataSource orderDataSource() {
        return new DruidDataSource();
    }

    @Bean("storageDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.storage")
    public DataSource storageDataSource() {
        return new DruidDataSource();
    }

    @Bean("payDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.pay")
    public DataSource payDataSource() {
        return new DruidDataSource();
    }

    @Bean("dataSourceProxy")
    public DataSourceProxy orderDatasourceProxy(@Qualifier("orderDataSource") DataSource dataSource) {
        return new DataSourceProxy(dataSource);
    }

    @Bean
    @ConditionalOnMissingBean
    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(@Qualifier("dataSourceProxy") DataSource dataSource) {
        MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        mybatisSqlSessionFactoryBean.setDataSource(dataSource);

        return mybatisSqlSessionFactoryBean;
    }

}
