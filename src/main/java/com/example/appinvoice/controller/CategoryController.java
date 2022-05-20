package com.example.appinvoice.controller;


import com.example.appinvoice.dto.res.Response;
import com.example.appinvoice.entity.Category;
import com.example.appinvoice.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @PostMapping
    public Response save(@RequestBody Category category) {
        return categoryService.save(category);
    }


    // Get All products Category lists
    @GetMapping("/list")
    public List<Category> findAll() {
        return categoryService.findAll();
    }



}
