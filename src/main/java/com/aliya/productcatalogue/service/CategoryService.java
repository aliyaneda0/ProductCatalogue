package com.aliya.productcatalogue.service;

import com.aliya.productcatalogue.model.Category;
import com.aliya.productcatalogue.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private  final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){

        return categoryRepository.findAll();
    }
}
