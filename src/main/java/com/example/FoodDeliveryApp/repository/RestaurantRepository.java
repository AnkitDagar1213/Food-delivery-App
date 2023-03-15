package com.example.FoodDeliveryApp.repository;

import com.example.FoodDeliveryApp.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
}