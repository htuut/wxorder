package com.htuut.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htuut.entity.OrderDetail;
import com.htuut.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    /**
     * 订单状态：默认为 0 新下订单
     */
    private Integer orderStatus;

    /**
     * 支付状态：默认为 0 未支付
     */
    private Integer payStatus;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> detailList;


}
