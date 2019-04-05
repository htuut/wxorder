package com.htuut.controller;

import com.htuut.entity.ProductCategory;
import com.htuut.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController {

    @Autowired
    private ProductCategoryRepository repository;

    @GetMapping("/productCategory/{id}")
    public Object getOne(@PathVariable("id") Integer id) {

        ProductCategory one = repository.findOne(id);

        return one;

    }

}
