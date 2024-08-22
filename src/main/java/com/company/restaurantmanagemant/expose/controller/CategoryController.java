package com.company.restaurantmanagemant.expose.controller;


import com.company.restaurantmanagemant.application.service.CategoryService;
import com.company.restaurantmanagemant.persistence.entity.Category;
import com.company.restaurantmanagemant.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



// Spring Stereotype annotation
@RestController
@RequestMapping("/categories")
public class CategoryController {

    /*

    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public List<Category> findAll(){

        List<Category> categories = (List<Category>) categoryRepository.findAll();

        return  categories;
    }

    @GetMapping("/{id}")
    public Category findId( @PathVariable("id") Long id){

        return categoryRepository.findById(id).orElse(null);
    }
    */


    private CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> findAll(){
      return  categoryService.findAll();
    }


    @GetMapping("/{id}")
    public Category findId( @PathVariable("id") Long id){
         return categoryService.findById(id);
    }


}
