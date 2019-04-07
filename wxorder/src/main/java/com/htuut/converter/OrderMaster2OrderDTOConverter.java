package com.htuut.converter;

import com.htuut.dto.OrderDTO;
import com.htuut.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * OrderMaster 转 OrderDTO 转换器
 */
public class OrderMaster2OrderDTOConverter {


    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();

        BeanUtils.copyProperties(orderMaster, orderDTO);

        return orderDTO;
    }


    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {

        return orderMasterList.stream().map(
                e -> convert(e)
        ).collect(Collectors.toList());

    }


}
