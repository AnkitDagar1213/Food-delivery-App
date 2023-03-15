package com.example.FoodDeliveryApp.controller;

import com.example.FoodDeliveryApp.model.Order;
import com.example.FoodDeliveryApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/FoodDeliver-App")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping(value = "/create_order")
    public ResponseEntity<String> create_order(@RequestBody Order order){
        orderService.create_order(order);
        return new ResponseEntity<>("Order Created", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_all_Orders")
    public ResponseEntity<String> get_all_Orders(){
        List<Order> orders=orderService.get_all_Orders();
        return new ResponseEntity<>(orders+"all Orders",HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_order_by_userId")
    public ResponseEntity<String> get_order_by_userId(@RequestParam Integer userId){
        Order orders=orderService.get_order_by_userId(userId);
        return new ResponseEntity<>(orders+"Orders by"+userId,HttpStatus.ACCEPTED);
    }
}