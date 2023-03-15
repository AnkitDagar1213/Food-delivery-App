package com.example.FoodDeliveryApp.repository;

import com.example.FoodDeliveryApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer> {
}