package com.htuut.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private String productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;


}
