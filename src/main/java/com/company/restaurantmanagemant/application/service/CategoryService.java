package com.company.restaurantmanagemant.application.service;

import com.company.restaurantmanagemant.application.dto.category.CategoryDto;
import com.company.restaurantmanagemant.application.dto.category.CategorySmallDto;


import java.util.List;

public interface CategoryService {

    //    List<Category> findAll();
    List<CategorySmallDto> findAll();

    //    Category findById(Long id);
    CategoryDto findById(Long id);
}
