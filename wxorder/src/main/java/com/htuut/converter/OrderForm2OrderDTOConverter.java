package com.htuut.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.htuut.dto.OrderDTO;
import com.htuut.entity.OrderDetail;
import com.htuut.enums.ResultEnum;
import com.htuut.exception.SellException;
import com.htuut.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {

            orderDetailList = gson.fromJson(gson.toJson(orderForm.getItems()), new TypeToken<List<OrderDetail>>(){}.getType());

        } catch (Exception e) {
            log.error("【对象转换】，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setDetailList(orderDetailList);

        return orderDTO;

    }

}
