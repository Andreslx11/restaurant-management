package com.company.restaurantmanagemant.application.dto.category;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// para recibir información


// Lombok annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryBodyDto {

    private String name;
    private String description;
}
