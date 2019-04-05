package com.htuut.service.impl;

import com.htuut.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl productCategoryServiceImpl;


    @Test
    public void findOne() {
        ProductCategory one = productCategoryServiceImpl.findOne(1);
        Assert.assertEquals(new Integer(1), one.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = productCategoryServiceImpl.findAll();
        Assert.assertNotEquals(0, all.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = productCategoryServiceImpl.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertNotEquals(0, byCategoryTypeIn.size());

    }

    @Test
    public void save() {
        ProductCategory p = new ProductCategory("李四", 10);
        ProductCategory save = productCategoryServiceImpl.save(p);
        Assert.assertNotNull(save);


    }
}