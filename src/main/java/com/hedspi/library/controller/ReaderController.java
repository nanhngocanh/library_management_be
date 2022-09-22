package com.hedspi.library.controller;


import com.hedspi.library.model.BorrowingBooksManage;
import com.hedspi.library.model.Reader;
import com.hedspi.library.request.ReaderSearchRequest;
import com.hedspi.library.response.ReaderBorrowingBook;
import com.hedspi.library.response.ReaderResponse;
import com.hedspi.library.response.ReaderSearch;
import com.hedspi.library.service.BorrowingBooksManageService;
import com.hedspi.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReaderController {
    @Autowired
    private ReaderService readerService;
    @Autowired
    private BorrowingBooksManageService borrowingBooksManageService;

    @PostMapping("/v1/readers")
    public Page<ReaderSearch> searchReader(@RequestBody ReaderSearchRequest readerSearchRequest){
        Pageable pageable = PageRequest.of(readerSearchRequest.getPage(),readerSearchRequest.getSize());
        if (readerSearchRequest.getId()==null) return readerService.searchReaderByKeyword(readerSearchRequest, pageable);
        return readerService.searchReader(readerSearchRequest,pageable);
    }

    @GetMapping("/v1/readers/{id}")
    public ReaderResponse getReaderDetail(@PathVariable Integer id){
        Optional<Reader> reader = readerService.findById(id);
        List<ReaderBorrowingBook> borrowingBooksManages = borrowingBooksManageService.findByReaderId(id);
        ReaderResponse readerResponse = new ReaderResponse(reader,borrowingBooksManages);
        return readerResponse;
    }

}
