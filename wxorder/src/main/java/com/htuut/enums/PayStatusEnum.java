package com.htuut.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {

    WAIT(0,"微支付"),

    FINISH(1,"支付完成");

    private Integer code;

    private String desc;

    PayStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
