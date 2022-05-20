package com.example.appinvoice.service;


import com.example.appinvoice.dto.res.Response;
import com.example.appinvoice.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Response save(Category category);

    Response findById(Integer id);

    Response edit(Integer id, Category category);

    Response removeById(Integer id);

    Category findOneByProductId(Integer productId);
}
