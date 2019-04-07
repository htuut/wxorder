package com.htuut.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),

    PRODUCT_NOT_EXIST(10, "商品不存在"),

    PRODUCT_STOCK_ERROR(11,"库存不足"),

    ORDER_NOT_EXIST(13,"订单不存在"),

    ORDER_DETAIL_NOT_EXIST(14,"订单详情不存在"),

    ORDER_STATUS_ERROR(15,"订单状态错误"),

    UPDATE_ORDER_FAIL(16,"更新订单失败"),

    ORDER_DETAIL_EMPTY(17,"商品详情为空"),

    ORDER_PAY_STATUS_ERROR(18,"订单支付状态不正确"),

    CART_EMPTY(19,"购物车不能为空"),

    ORDER_OWNER_ORDER(20,"该订单不属于当前用户"),

    ;


    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

}
