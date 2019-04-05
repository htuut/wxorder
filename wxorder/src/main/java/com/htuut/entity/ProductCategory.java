package com.htuut.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "product_category")
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
