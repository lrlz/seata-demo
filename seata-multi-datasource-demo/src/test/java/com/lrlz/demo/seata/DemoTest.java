package com.lrlz.demo.seata;

import com.lrlz.demo.seata.entity.Orders;
import com.lrlz.demo.seata.service.IOrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class DemoTest {
    @Autowired
    IOrdersService ordersService;

    @Test
    public void testAdd(){
        Orders entity = new Orders();
        entity.setProductId(233);
         ordersService.save(entity);
    }

}
