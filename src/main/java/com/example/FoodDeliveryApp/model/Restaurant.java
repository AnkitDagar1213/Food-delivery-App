package com.example.FoodDeliveryApp.model;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Restaurant_id;
    @NotNull(message = "Name is mandatory")
    @Length(min = 5,max = 20)
    private String name;
    @NotNull(message = "Address is mandatory")
    @Length(min = 5,max = 50)
    private String address;
    @OneToMany
    @Column(name="FoodItems")
    private List<FoodItem> foodItems;
}
