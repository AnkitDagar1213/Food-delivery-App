package com.example.FoodDeliveryApp.controller;

import com.example.FoodDeliveryApp.model.FoodItem;
import com.example.FoodDeliveryApp.service.FoodItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FoodItemController {
    @Autowired
    FoodItemService foodItemService;

    @PostMapping(value="/add-food_item")
    public ResponseEntity<String> createfood(@Valid @RequestBody FoodItem foodItem){
        foodItemService.createfood(foodItem);
        return new ResponseEntity<String>("food item id Created",HttpStatus.ACCEPTED);;
    }
    @GetMapping(value = "/get_All_foodItems")
    public List<FoodItem> get_All_foodItems(){
        foodItemService.get_All_foodItems();
    }
    @GetMapping(value = "/get_foodItem_byId")
    public FoodItem get_foodItem_byId(@RequestParam Integer FoodItem_id){
        return foodItemService.get_foodItem_byId(FoodItem_id);
    }
    @DeleteMapping(value = "/delete_fooditem_byid")
    public ResponseEntity delete_fooditem_byid(@RequestParam Integer FoodItem_id){
        foodItemService.delete_fooditem_byid(FoodItem_id);
        return new ResponseEntity<>("Food item is deleted successfully", HttpStatus.OK);
    }
    @PutMapping(value = "/update-food-item/{foodid}")
    public ResponseEntity updatefood(@PathVariable Integer foodid,@RequestBody FoodItem foodItem){
        foodItemService.updatefood(foodid,foodItem);
        return new ResponseEntity<>("Update the food item",HttpStatus.ACCEPTED);
    }
}