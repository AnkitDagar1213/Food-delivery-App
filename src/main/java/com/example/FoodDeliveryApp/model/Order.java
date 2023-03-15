package com.example.FoodDeliveryApp.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Order_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name="User_id")
    private User user_id;
    @OneToOne
    @JoinColumn(name = "FoodItem_id")
    private FoodItem FoodItem_id;
}