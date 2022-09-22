package com.hedspi.library.controller;

import com.hedspi.library.request.BookSearchRequest;
import com.hedspi.library.request.PageSize;
import com.hedspi.library.response.BookDetail;
import com.hedspi.library.response.BookSearch;
import com.hedspi.library.response.BorrowingDetailByBook;
import com.hedspi.library.response.SuppliedBook;
import com.hedspi.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/v1/languages")
    public List<String> getLanguages(){
        return bookService.getLanguages();
    }

    @GetMapping("/v1/publishYears")
    public List<Integer> getPublishYears(){
        return bookService.getPublishYears();
    }

    @GetMapping("/v1/publishers")
    public List<String> getPublishers(){
        return bookService.getPublishers();
    }

    @GetMapping("/v1/floors")
    public List<Integer> getFloors(){
        return bookService.getFloors();
    }

    @GetMapping("/v1/rooms")
    public List<String> getRooms(){
        return bookService.getRooms();
    }

    @GetMapping("/v1/rows")
    public List<String> getRows(){
        return bookService.getRows();
    }

    @PostMapping("/v1/books")
    public Page<BookSearch> getBookSearch(@RequestBody BookSearchRequest bookSearchRequest){
        Pageable pageable = PageRequest.of(bookSearchRequest.getPage(),bookSearchRequest.getSize());
        return bookService.getBookSearch(bookSearchRequest,pageable);
    }

    @GetMapping("/v1/books/{id}")
    public BookDetail getBookDetail(@PathVariable Integer id){
        return bookService.getBookDetail(id);
    }

    @PostMapping("/v1/borrowingDetailByBook/{bookId}")
    public Page<BorrowingDetailByBook> getBorrowingDetailByBook(@PathVariable Integer bookId, @RequestBody PageSize pageSize){
        Pageable pageable = PageRequest.of(pageSize.getPage(),pageSize.getSize());
        return bookService.getBorrowingDetailByBook(bookId,pageable);
    }

    @PostMapping("/v1/suppliedBooks/{id}")
    public Page<SuppliedBook> getSupplierBookBySupplier(@PathVariable String id, @RequestBody PageSize pageSize){
        Pageable pageable = PageRequest.of(pageSize.getPage(),pageSize.getSize());
        return bookService.getSuppliedBookBySupplier(id,pageable);
    }
}
