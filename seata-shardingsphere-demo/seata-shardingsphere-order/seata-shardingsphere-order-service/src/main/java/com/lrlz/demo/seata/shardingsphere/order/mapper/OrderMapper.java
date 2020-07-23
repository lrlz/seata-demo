package com.lrlz.demo.seata.shardingsphere.order.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lrlz.demo.seata.shardingsphere.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

}