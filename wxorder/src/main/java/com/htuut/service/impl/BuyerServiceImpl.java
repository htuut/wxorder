package com.htuut.service.impl;

import com.htuut.dto.OrderDTO;
import com.htuut.enums.ResultEnum;
import com.htuut.exception.SellException;
import com.htuut.service.BuyerService;
import com.htuut.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {

        return checkOrderOwner(openid, orderId);
    }


    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {

        OrderDTO orderDTO = checkOrderOwner(openid, orderId);

        if (orderDTO == null) {
            log.error("【取消订单】查不到该订单,openid={},orderId={}", openid, orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        orderService.cancel(orderDTO);

        return orderDTO;
    }


    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);

        if (orderDTO == null) {
            return null;
        }

        if (!orderDTO.getBuyerOpenid().equals(openid)) {
            log.error("【查询订单】订单的 openid 不一致.openid={},orderDTO={}", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ORDER);
        }

        return orderDTO;
    }
}
