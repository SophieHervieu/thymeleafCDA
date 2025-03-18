package com.adrar.sitecda.service;

import com.adrar.sitecda.model.Category;
import com.adrar.sitecda.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        if(categoryRepository.count() == 0) {
            Category category = new Category();
        }
        List<Category> categories = new ArrayList<>();
        for(Category category : categoryRepository.findAll()) {
            categories.add(category);
        }
        return categories;
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).get();
    }
}
