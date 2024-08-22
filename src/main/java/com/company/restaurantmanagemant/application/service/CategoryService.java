package com.company.restaurantmanagemant.application.service;

import com.company.restaurantmanagemant.persistence.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();
    Category findById(Long id);
}
