package com.hedspi.library.repository;

import com.hedspi.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, String> {

    @Query("select distinct type from Category order by type asc ")
    List<String> getParentCategories();

    @Query("select distinct c from Category c where c.type like %:parentCategory% order by c.name asc ")
    List<Category> getCategoriesByParentCategory(String parentCategory);

    @Query("select distinct c from Category c order by c.name asc ")
    List<Category> getAllCategories();
}