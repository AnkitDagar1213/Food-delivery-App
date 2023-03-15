package com.example.FoodDeliveryApp.controller;

import com.example.FoodDeliveryApp.model.Admin;
import com.example.FoodDeliveryApp.model.FoodItem;
import com.example.FoodDeliveryApp.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/FoodDeliver-App")
public class AdminController {
    @Autowired
    FoodItemController foodItemController;
    @Autowired
    AdminService adminService;
    @PostMapping(value = "/addadmin")
    public ResponseEntity<String> addadmin(@Valid @RequestBody Admin admin){
        adminService.addadmin(admin);
        return new ResponseEntity<>("Admin is created", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_all_admin")
    public ResponseEntity<String> get_all_admin(){
        List<Admin> admins=adminService.get_all_admin();
        return new ResponseEntity<>(admins+"all Admins", HttpStatus.ACCEPTED);
    }
    @PostMapping(value="/Admin/add-food_item")
    public ResponseEntity<String> createfood(@Valid @RequestBody FoodItem foodItem){
        foodItemController.createfood(foodItem);
        return new ResponseEntity<>("food item is Created", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/Admin/get_All_foodItems")
    public ResponseEntity<String> get_All_foodItems(){
        List<FoodItem> foods=foodItemController.get_All_foodItems();
        return new ResponseEntity<>(foods+"all food items",HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/Admin/get_foodItem_byId")
    public ResponseEntity<String> get_foodItem_byId(@RequestParam Integer FoodItem_id){
        FoodItem food=foodItemController.get_foodItem_byId(FoodItem_id);
        return new ResponseEntity<> (food+"your food Item",HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/Admin/delete_fooditem_byid")
    public ResponseEntity<String>delete_fooditem_byid(@RequestParam Integer FoodItem_id){
        foodItemController.delete_fooditem_byid(FoodItem_id);
        return new ResponseEntity<>("Food item is deleted successfully", HttpStatus.OK);
    }
    @PutMapping(value = "/Admin/update-food-item/{foodid}")
    public ResponseEntity updatefood(@PathVariable Integer foodid,@RequestBody FoodItem foodItem){
        foodItemController.update_fooditem(foodid,foodItem);
        return new ResponseEntity<>("food item is updated",HttpStatus.ACCEPTED);
    }
}