package com.example.FoodDeliveryApp.repository;

import com.example.FoodDeliveryApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}