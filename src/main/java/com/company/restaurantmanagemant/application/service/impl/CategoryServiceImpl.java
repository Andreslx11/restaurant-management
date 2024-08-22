package com.company.restaurantmanagemant.application.service.impl;

import com.company.restaurantmanagemant.application.service.CategoryService;
import com.company.restaurantmanagemant.persistence.entity.Category;
import com.company.restaurantmanagemant.persistence.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {



    private  final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Category> findAll() {
        return (List<Category>)  categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById( id).orElse(null);
    }
}
