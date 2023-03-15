package com.example.FoodDeliveryApp.service;

import com.example.FoodDeliveryApp.model.Restaurant;
import com.example.FoodDeliveryApp.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    public Restaurant create_Restaurent(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> get_all_Restaurant() {
        return restaurantRepository.findAll();
    }

    public Restaurant get_Restaurant_byId(Integer id) {
        return restaurantRepository.findById(id).get();
    }
}