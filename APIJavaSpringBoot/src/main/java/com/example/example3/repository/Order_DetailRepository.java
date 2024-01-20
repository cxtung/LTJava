package com.example.example3.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.example3.entity.Category;
import com.example.example3.entity.Order_Detail;


public interface Order_DetailRepository extends JpaRepository<Order_Detail, Long> {
        Page<Order_Detail> findAll(Pageable pageable);

}
