package com.htuut.repository;

import com.htuut.entity.ProductInfo;
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
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {

        ProductInfo info = new ProductInfo();
        info.setProductId("123456");
        info.setProductName("榴莲披萨");
        info.setProductPrice(new BigDecimal(10));
        info.setProductStock("100");
        info.setProductDescription("这是商品描述");
        info.setProductIcon("https://xxxxx.png");
        info.setProductStatus(1);
        info.setCategoryType(1);

        ProductInfo save = repository.save(info);

        Assert.assertNotNull(save);

    }


    @Test
    public void findByProductStatusTest() {
        List<ProductInfo> byProductStatus = repository.findByProductStatus(1);
        Assert.assertNotEquals(0, byProductStatus.size());
    }

}