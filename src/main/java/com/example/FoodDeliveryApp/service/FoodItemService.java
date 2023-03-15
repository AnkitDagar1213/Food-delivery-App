package com.example.FoodDeliveryApp.service;

import com.example.FoodDeliveryApp.model.FoodItem;
import com.example.FoodDeliveryApp.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Service
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
    public void update_fooditem(Integer FoodItem_id , FoodItem foodItem){
        FoodItem food = get_foodItem_byId(FoodItem_id);
        food.setName(foodItem.getName());
        food.setDescription(foodItem.getDescription());
    }
}