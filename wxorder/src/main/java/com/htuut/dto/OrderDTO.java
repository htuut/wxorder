package com.htuut.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htuut.entity.OrderDetail;
import com.htuut.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)//为 null 的值不返回给前端
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

    @JsonSerialize(using = Date2LongSerializer.class)//设置返回给前端日期的格式
    private Date createTime;

    @JsonSerialize(using = Date2LongSerializer.class)//设置返回给前端日期的格式
    private Date updateTime;

    private List<OrderDetail> detailList;


}
