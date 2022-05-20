package com.example.appinvoice.service;


import com.example.appinvoice.dto.res.Response;
import com.example.appinvoice.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();

    Response save(Category category);
}
