package com.example.example3.controller;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.example3.entity.Order_Detail;
import com.example.example3.service.Order_DetailService;



@RestController
@AllArgsConstructor
@RequestMapping("api/order_details")
@CrossOrigin(origins = "*", exposedHeaders = "Content-Range")

public class Order_DetailController {
    
    private Order_DetailService order_DetailService;


    @PostMapping
    public ResponseEntity<Order_Detail> createOrder_Detail(@RequestBody Order_Detail order_Detail) {
        Order_Detail savedOrder_Detail = order_DetailService.createOrder_Detail(order_Detail);
        return new ResponseEntity<>(savedOrder_Detail, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<Order_Detail> getOrder_DetailById(@PathVariable("id") Long order_DetailId) {
        Order_Detail order_Detail = order_DetailService.getOrder_DetailById(order_DetailId);
        if (order_Detail != null) {
            return new ResponseEntity<>(order_Detail, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping
    public ResponseEntity<Page<Order_Detail>> getAllOrder_Details(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Order_Detail> Order_Details = order_DetailService.getAllOrder_Details(pageable);
        return new ResponseEntity<>(Order_Details, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Order_Detail> updateOrder_Details(@PathVariable("id") Long order_DetailId,
            @RequestBody Order_Detail order_Detail) {
        order_Detail.setId(order_DetailId);
        Order_Detail updatedOrder_Detail = order_DetailService.updateOrder_Detail(order_Detail);
        return new ResponseEntity<>(updatedOrder_Detail, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder_Detail(@PathVariable("id") Long order_DetailId) {
        order_DetailService.deleteOrder_Detail(order_DetailId);
        return new ResponseEntity<>("Order_Detail successfully deleted!", HttpStatus.OK);
    }
}
