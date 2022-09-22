package com.hedspi.library.repository;

import com.hedspi.library.model.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Query("select distinct a from Author a order by a.name asc ")
    List<Author> getAuthors();
}