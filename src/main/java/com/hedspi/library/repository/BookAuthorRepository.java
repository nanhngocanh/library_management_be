package com.hedspi.library.repository;

import com.hedspi.library.model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Integer> {
    @Query("select distinct a.name from BookAuthor ba join ba.author a where ba.bookId = :bookId")
    List<String> getAuthorsByBookId(Integer bookId);
}