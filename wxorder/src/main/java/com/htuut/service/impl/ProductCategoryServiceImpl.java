package com.htuut.service.impl;

import com.htuut.entity.ProductCategory;
import com.htuut.repository.ProductCategoryRepository;
import com.htuut.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        ProductCategory one = repository.findOne(categoryId);
        return one;
    }

    @Override
    public List<ProductCategory> findAll() {
        List<ProductCategory> all = repository.findAll();
        return all;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(categoryTypeList);
        return byCategoryTypeIn;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        ProductCategory save = repository.save(productCategory);
        return save;
    }
}
