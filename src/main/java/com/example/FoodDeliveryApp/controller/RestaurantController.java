package com.example.FoodDeliveryApp.controller;

import com.example.FoodDeliveryApp.model.Restaurant;
import com.example.FoodDeliveryApp.service.RestaurantService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/v1/FoodDeliver-App")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping(value = "/create_Restaurent")
    public ResponseEntity<String> create_Restaurent(@RequestBody Restaurant restaurant){
        restaurantService.create_Restaurent(restaurant);
        return new ResponseEntity<>("Restaurant is added", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_all_Restaurant")
    public ResponseEntity<String> get_all_Restaurant(){
        List<Restaurant> restautants=restaurantService.get_all_Restaurant();
        return new ResponseEntity<>(restautants+"all Restaurants",HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_Restaurant_byId")
    public ResponseEntity<String> get_Restaurant_byId(@RequestParam Integer id){
        Restaurant restautants=restaurantService.get_Restaurant_byId(id);
        return new ResponseEntity<>(restautants+"Restaurant"+id,HttpStatus.ACCEPTED);
    }
}