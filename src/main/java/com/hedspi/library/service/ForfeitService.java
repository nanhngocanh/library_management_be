package com.hedspi.library.service;

import com.hedspi.library.model.Forfeit;
import com.hedspi.library.repository.BorrowingBooksDetailRepository;
import com.hedspi.library.repository.ForfeitRepository;
import com.hedspi.library.response.BookRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForfeitService {
    @Autowired
    private ForfeitRepository forfeitRepository;
    @Autowired
    private BorrowingBooksDetailRepository borrowingBooksDetailRepository;

    public List<Forfeit> getAll() {
        return forfeitRepository.findAll();
    }

}
