package com.adrar.sitecda.controller;

import com.adrar.sitecda.model.Category;
import com.adrar.sitecda.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public String showAllCategories(Model model) {
        Iterable<Category> category = categoryService.getCategories();
        model.addAttribute("category", category);
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String showCategory(Model model, @PathVariable Integer id) {
        Category oneCategory = categoryService.getCategoryById(id);
        model.addAttribute("category", oneCategory);
        return "category";
    }
}
