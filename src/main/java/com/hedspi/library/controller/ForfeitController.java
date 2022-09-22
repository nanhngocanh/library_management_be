package com.hedspi.library.controller;

import com.hedspi.library.model.Forfeit;
import com.hedspi.library.repository.BorrowingBooksDetailRepository;
import com.hedspi.library.response.BookRating;
import com.hedspi.library.service.ForfeitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ForfeitController {
    @Autowired
    private ForfeitService forfeitService;

    @GetMapping(value = "/forfeits")
    public List<Forfeit> getAll() {
        return forfeitService.getAll();
    }

    @GetMapping(value = "topBooks")
    public  List<BookRating> getTopBooks(){
        return forfeitService.getTopBooks();
    }
}
