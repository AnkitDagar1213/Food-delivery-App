package com.example.FoodDeliveryApp.model;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_FoodItem")
public class FoodItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int FoodItem_id;
    @NotNull(message = "Name is mandatory")
    @Column(name="Name")
    private String name;
    @Length(min=5,max=50,message ="Description Length should be in 5-50")
    @NotNull(message = "description is mandatory")
    private String description;
}
