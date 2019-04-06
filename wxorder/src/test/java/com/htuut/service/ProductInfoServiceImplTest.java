package com.htuut.service;

import com.htuut.entity.ProductInfo;
import com.htuut.service.impl.ProductInfoServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl impl;

    @Test
    public void findOne() {
        ProductInfo one = impl.findOne("123456");
        Assert.assertEquals("123456", one.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = impl.findUpAll();
        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll() {
        Pageable pageable = new PageRequest(0, 2);
        Page<ProductInfo> all = impl.findAll(pageable);
        Assert.assertNotEquals(0, all.getTotalElements());

    }

    @Test
    public void save() {

        ProductInfo info = new ProductInfo();
        info.setProductId("1234567");
        info.setProductName("榴莲披萨");
        info.setProductPrice(new BigDecimal(10));
        info.setProductStock(100);
        info.setProductDescription("这是商品描述");
        info.setProductIcon("https://xxxxx.png");
        info.setProductStatus(1);
        info.setCategoryType(1);

        ProductInfo save = impl.save(info);

        Assert.assertNotNull(save);
    }
}