package com.htuut.repository;

import com.htuut.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("lisi");
        orderMaster.setBuyerPhone("1768875");
        orderMaster.setBuyerAddress("shanghai");
        orderMaster.setBuyerOpenid("130130");
        orderMaster.setOrderAmount(new BigDecimal(4.8));
        OrderMaster save = repository.save(orderMaster);
        Assert.assertNotNull(save);

    }

    @Test
    public void findByBuyerOpenidTest(){
        PageRequest pageRequest = new PageRequest(0,2);

        Page<OrderMaster> byBuyerOpenid = repository.findByBuyerOpenid("130130",pageRequest);

        Assert.assertNotEquals(0,byBuyerOpenid.getTotalElements());
    }

}