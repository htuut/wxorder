package com.htuut.repository;

import com.htuut.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailsRepositoryTest {

    @Autowired
    private OrderDetailsRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567");
        orderDetail.setOrderId("123");
        orderDetail.setProductIcon("http://xxxx.png");
        orderDetail.setProductId("11111");
        orderDetail.setProductName("黄焖鸡米饭");
        orderDetail.setProductPrice(new BigDecimal(8.9));
        orderDetail.setProductQuantity(2);

        OrderDetail save = repository.save(orderDetail);

        Assert.assertNotNull(save);

    }


    @Test
    public void findByOrOrderIdTest() {

        List<OrderDetail> byOrOrderId = repository.findByOrOrderId("123");

        Assert.assertNotEquals(0,byOrOrderId.size());

    }

}