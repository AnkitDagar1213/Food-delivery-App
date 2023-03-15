package com.example.FoodDeliveryApp.service;

import com.example.FoodDeliveryApp.model.Admin;
import com.example.FoodDeliveryApp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public Admin addadmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Admin> get_all_admin() {
        return adminRepository.findAll();
    }
}