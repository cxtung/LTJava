package com.example.example3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.example3.entity.Order_Detail;

public interface Order_DetailService {
    Order_Detail createOrder_Detail(Order_Detail order_Detail);

    Order_Detail getOrder_DetailById(Long order_DetailId);

    Page<Order_Detail> getAllOrder_Details(Pageable pageable);

    Order_Detail updateOrder_Detail(Order_Detail order_Detail);

    void deleteOrder_Detail(Long order_DetailId);
}
