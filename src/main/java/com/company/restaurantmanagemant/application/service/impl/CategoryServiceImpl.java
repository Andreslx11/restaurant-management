package com.company.restaurantmanagemant.application.service.impl;

import com.company.restaurantmanagemant.application.dto.category.CategoryDto;
import com.company.restaurantmanagemant.application.dto.category.CategorySmallDto;
import com.company.restaurantmanagemant.application.mapper.CategoryMapper;
import com.company.restaurantmanagemant.application.service.CategoryService;
import com.company.restaurantmanagemant.persistence.entity.Category;
import com.company.restaurantmanagemant.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// Lombok annotations
// me va generar los constructores con las los atributos que tengo, haciendo la inyeccion de dependecias
@RequiredArgsConstructor



// Spring Stereotypes annotations
@Service
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;


    @Override
    public List<CategorySmallDto> findAll() {

        // con programción imperativa
        /*
        List<CategorySmallDto>  dtos = new ArrayList<>();

        List<Category> categories = (List<Category>)  categoryRepository.findAll();

        for(Category category : categories){
            dtos.add(categoryMapper.toSmallDto(category));
        }

        return dtos;
        */

        // con programación funcional
        return ((List<Category>) categoryRepository.findAll())
                .stream()
                .map(category -> categoryMapper.toSmallDto(category))
                .toList();
    }


    @Override
    public CategoryDto findById(Long id) {
        return categoryRepository.findById(id)
                .map(categoryMapper::toDto)
                .orElse(null);
    }
}
