package com.htuut.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {

    NEW(0, "新下订单"),

    FINISH(1, "订单完成"),

    CANCEL(2, "取消订单"),
    ;

    private Integer code;

    private String desc;

    OrderStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
