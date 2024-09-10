package com.company.restaurantmanagemant.application.dto.category;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// para exponer información


// Lombok annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategorySmallDto {

    private Long id;
    private String name;
}
