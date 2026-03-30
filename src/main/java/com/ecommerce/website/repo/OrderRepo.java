package com.ecommerce.website.repo;

import com.ecommerce.website.model.Order;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer>{
    Optional<Order> findByOrderId(String orderId);
}
