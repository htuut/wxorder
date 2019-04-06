package com.htuut.repository;

import com.htuut.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailsRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrOrderId(String orderId);

}
