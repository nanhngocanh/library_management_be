package com.hedspi.library.repository;

import com.hedspi.library.model.BorrowingBooksDetail;
import com.hedspi.library.response.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BorrowingBooksDetailRepository extends JpaRepository<BorrowingBooksDetail, Integer> {
    @Query(value = "SELECT distinct new com.hedspi.library.response.BookRating(bbd.bookId,bbd.book.name, COUNT(bbd.bookId)) FROM BorrowingBooksDetail bbd GROUP BY bbd.bookId ORDER BY COUNT(bbd.bookId) desc ")
    List<BookRating> getTopBooks();
}