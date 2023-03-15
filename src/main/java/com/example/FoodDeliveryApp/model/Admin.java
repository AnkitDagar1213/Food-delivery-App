package com.example.FoodDeliveryApp.model;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Admin_id;
    @Length(min = 5,max = 20,message = "Username Length should be in 5-20")
    @Column(name="Username")
    private String username;
    @Email(message = "enter valid email")
    @NotNull
    @Column(name="Email")
    private String email;
    @Digits(integer = 10,fraction = 0)
    @NotNull
    @Column(name="Phone_number")
    private String phone_number;
    @JoinColumn(name = "FoodList")
    @OneToMany(fetch = FetchType.LAZY)
    private List<FoodItem> foodList;
    @JoinColumn(name = "OrderList")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Order>  orderList;
}