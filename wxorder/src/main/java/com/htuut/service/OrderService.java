package com.htuut.service;

import com.htuut.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     *
     * @param orderId
     * @return
     */
    OrderDTO findOne(String orderId);


    /**
     * 查询订单列表
     *
     * @param buyerOpenId
     * @param pageable
     * @return
     */
    Page<OrderDTO> findList(String buyerOpenId, Pageable pageable);

    /**
     * 取消订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完成订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO paid(OrderDTO orderDTO);


}
