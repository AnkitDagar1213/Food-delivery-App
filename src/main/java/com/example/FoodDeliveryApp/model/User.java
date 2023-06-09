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
@Table(name = "tbl_User")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int User_id;
    @NotNull(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Email is mandatory")
    @Email(message = "Invalid email address")
    @Column(name = "email")
    private String email;
    @NotNull(message = "Address is mandatory")
    @Length(min = 5,max = 50)
    private String address;
    @Digits(integer = 10,fraction = 0)
    @Column(name = "phone_number")
    private String phoneNumber;
}