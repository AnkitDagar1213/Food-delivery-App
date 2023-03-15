package com.example.FoodDeliveryApp.service;

import com.example.FoodDeliveryApp.model.FoodItem;
import com.example.FoodDeliveryApp.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FoodItemService {
    @Autowired
    FoodItemRepository foodItemRepository;
    public FoodItem createfood(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    public List<FoodItem> get_All_foodItems() {
        return foodItemRepository.findAll();
    }

    public FoodItem get_foodItem_byId(Integer foodItemId) {
        return foodItemRepository.findById(foodItemId).get();
    }

    public void delete_fooditem_byid(Integer foodItemId) {
        foodItemRepository.deleteById(foodItemId);
    }
}