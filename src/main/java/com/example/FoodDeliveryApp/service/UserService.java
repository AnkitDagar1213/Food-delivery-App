package com.example.FoodDeliveryApp.service;

import com.example.FoodDeliveryApp.model.User;
import com.example.FoodDeliveryApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User create_user(User user) {
        return userRepository.save(user);
    }
    public List<User> get_all_Users() {
        return userRepository.findAll();
    }

    public User get_User_by_Id(Integer Id) {
        return userRepository.findById(Id).get();
    }
}