package com.example.FoodDeliveryApp.controller;

import com.example.FoodDeliveryApp.model.FoodItem;
import com.example.FoodDeliveryApp.service.FoodItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/FoodDeliver-App")
public class FoodItemController {
    @Autowired
    FoodItemService foodItemService;
    public FoodItem createfood(@Valid @RequestBody FoodItem foodItem){
        return foodItemService.createfood(foodItem);
    }
    public List<FoodItem> get_All_foodItems(){
        return foodItemService.get_All_foodItems();
    }
    public FoodItem get_foodItem_byId(@RequestParam Integer FoodItem_id){
        return foodItemService.get_foodItem_byId(FoodItem_id);
    }
    public void delete_fooditem_byid(@RequestParam Integer FoodItem_id){
        foodItemService.delete_fooditem_byid(FoodItem_id);
    }
    public void update_fooditem(@PathVariable Integer foodid,@RequestBody FoodItem foodItem){
        foodItemService.update_fooditem(foodid,foodItem);
    }
}