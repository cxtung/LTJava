package com.example.example3.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.example3.entity.Order_Detail;
import com.example.example3.service.Order_DetailService;
import com.example.example3.repository.Order_DetailRepository;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Order_DetailServiceImpl implements Order_DetailService {

    private Order_DetailRepository order_DetailRepository;

    @Override
    public  Order_Detail createOrder_Detail( Order_Detail  order_Detail) {
        return order_DetailRepository.save(order_Detail);
    }

    @Override
    public Order_Detail getOrder_DetailById(Long order_DetailId) {
        Optional<Order_Detail> optionalOrder_Detail = order_DetailRepository.findById(order_DetailId);
        return optionalOrder_Detail.get();
    }

    @Override
    public Page<Order_Detail> getAllOrder_Details(Pageable pageable) {
        return order_DetailRepository.findAll(pageable);
    }

    @Override
    public Order_Detail updateOrder_Detail(Order_Detail order_Detail) {
        Order_Detail existingOrder_Detail= order_DetailRepository.findById(order_Detail.getId()).get();
        existingOrder_Detail.setQuantity(order_Detail.getQuantity());
        existingOrder_Detail.setPrice(order_Detail.getPrice());
        existingOrder_Detail.setOrder(order_Detail.getOrder());
        existingOrder_Detail.setProducts(order_Detail.getProducts());
        Order_Detail updatedOrder_Detail= order_DetailRepository.save(existingOrder_Detail);
        return updatedOrder_Detail;
    }

    @Override
    public void deleteOrder_Detail(Long order_DetailId) {
        order_DetailRepository.deleteById(order_DetailId);
    }
}
