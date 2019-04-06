package com.htuut.service.impl;

import com.htuut.dto.OrderDTO;
import com.htuut.entity.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class OrderServiceImplTest {

    public static final String BUYER_OPENID = "745645667";
    public static final String ORDER_ID = "1554553162425440030";
    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void create() {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("wangwu");
        orderDTO.setBuyerAddress("beijing");
        orderDTO.setBuyerPhone("1768875");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(10);
        orderDetailList.add(o1);

        orderDTO.setDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);

        log.info("【创建订单】result = {}", result);

        Assert.assertNotNull(result);


    }

    @Test
    public void findOne() {

        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        log.info("【查询单个订单】result={}", orderDTO);
        Assert.assertEquals(ORDER_ID, orderDTO.getOrderId());

    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}