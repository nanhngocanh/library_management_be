package com.hedspi.library.service;

import com.hedspi.library.model.Category;
import com.hedspi.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<String> getParentCategories(){
        return categoryRepository.getParentCategories();
    }

    public List<Category> getCategoriesByParentCategory(String parentCategory){
        String all = "All";
        if (parentCategory.equals(all)) return categoryRepository.getAllCategories();
        return categoryRepository.getCategoriesByParentCategory(parentCategory);
    }
}
