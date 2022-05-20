package com.example.appinvoice.controller;


import com.example.appinvoice.dto.res.Response;
import com.example.appinvoice.entity.Category;
import com.example.appinvoice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    final CategoryService categoryService;


    @PostMapping
    public Response save(@RequestBody Category category) {
        return categoryService.save(category);
    }


    // Get All products Category lists
    @GetMapping("/list")
    public List<Category> findAll() {
        return categoryService.findAll();
    }


    @GetMapping("/{id}")
    public Response findOneById(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @GetMapping
    public Category findOneByProductId(@RequestParam(name = "product_id") Integer productId) {
        return categoryService.findOneByProductId(productId);
    }

    @PutMapping("/{id}")
    public Response edit(@PathVariable Integer id, @RequestBody Category category) {
        return categoryService.edit(id, category);
    }

    @DeleteMapping("/{id}")
    public Response removeById(@PathVariable Integer id) {
        return categoryService.removeById(id);
    }

}
