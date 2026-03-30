package com.ecommerce.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.website.model.DTO.OrderRequest;
import com.ecommerce.website.model.DTO.OrderResponse;
import com.ecommerce.website.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;
    
    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {
        OrderResponse orderResponse = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse,HttpStatus.OK);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        List<OrderResponse> responses = orderService.getAllOrderResponses();
        return new ResponseEntity<>(responses,HttpStatus.OK);
    }
}
