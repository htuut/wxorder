package com.htuut.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),

    PRODUCT_STOCK_ERROR(11,"库存不足"),

    ORDER_NOT_EXIST(13,"订单不存在"),

    ORDER_DETAIL_NOT_EXIST(14,"订单详情不存在"),

    ;


    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

}
