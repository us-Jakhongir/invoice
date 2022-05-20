package com.example.appinvoice.service.impl;

import com.example.appinvoice.dto.res.Response;
import com.example.appinvoice.entity.Category;
import com.example.appinvoice.repository.CategoryRepository;
import com.example.appinvoice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
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

    @Override
    public Response findById(Integer id) {
        Optional<Category> byId = categoryRepository.findById(id);
        if (byId.isEmpty()) {
            return new Response("Not found!", false);
        }
        return new Response("Success!", true, byId.get());
    }

    @Override
    public Category findOneByProductId(Integer productId) {
        Category category = categoryRepository.findByProductId(productId);
        if (category != null)
            return category;
        return new Category();
    }

    @Override
    public Response edit(Integer id, Category category) {
        Optional<Category> categoryId = categoryRepository.findById(id);
        if (categoryId.isEmpty()) {
            return new Response("Not found!", false);
        }

        Category updated = categoryRepository.save(category);
        return new Response("Successfully updated ", true, updated);
    }


    @Override
    public Response removeById(Integer id) {
        Optional<Category> byId = categoryRepository.findById(id);
        if (byId.isEmpty())
            return new Response("Not found!", false);

        categoryRepository.deleteById(id);
        return new Response("Successfully Deleted", true);
    }
}
