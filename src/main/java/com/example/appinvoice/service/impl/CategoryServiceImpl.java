package com.example.appinvoice.service.impl;

import com.example.appinvoice.dto.res.Response;
import com.example.appinvoice.entity.Category;
import com.example.appinvoice.repository.CategoryRepository;
import com.example.appinvoice.service.CategoryService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository categoryRepository;


    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Response save(Category category) {
        Category savedCategory = categoryRepository.save(category);
        return new Response("Saved!", true, "ID: " + savedCategory.getId());
    }
}
