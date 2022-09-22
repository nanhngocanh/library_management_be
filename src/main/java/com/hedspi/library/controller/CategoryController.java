package com.hedspi.library.controller;

import com.hedspi.library.model.Category;
import com.hedspi.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/v1/parentCategories")
    public List<String> getParentCategories(){
        return categoryService.getParentCategories();
    }

    @PostMapping(value = "/v1/childCategories")
    public List<Category> getCategoriesByParentCategory(@RequestBody String parentCategory){
        return categoryService.getCategoriesByParentCategory(parentCategory);
    }
}
