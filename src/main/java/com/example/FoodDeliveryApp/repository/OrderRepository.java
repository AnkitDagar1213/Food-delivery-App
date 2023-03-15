package com.example.FoodDeliveryApp.repository;

import com.example.FoodDeliveryApp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order,Integer> {
}