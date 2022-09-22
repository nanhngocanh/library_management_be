package com.hedspi.library.repository;

import com.hedspi.library.model.BorrowingBooksDetail;
import com.hedspi.library.response.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BorrowingBooksDetailRepository extends JpaRepository<BorrowingBooksDetail, Integer> {
    @Query(value = "SELECT distinct new com.hedspi.library.response.BookRating(bookId, COUNT(bookId)) FROM BorrowingBooksDetail GROUP BY bookId " +
            "ORDER BY COUNT(bookId) desc ")
    List<BookRating> getTopBooks();
}