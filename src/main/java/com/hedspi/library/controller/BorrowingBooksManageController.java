package com.hedspi.library.controller;

import com.hedspi.library.request.BorrowingBookManageSearch;
import com.hedspi.library.response.BorrowingBookManageResponse;
import com.hedspi.library.response.BorrowingBooksDetail.Detail;
import com.hedspi.library.response.BorrowingBooksDetail.General;
import com.hedspi.library.response.BorrowingDetail;
import com.hedspi.library.service.BorrowingBooksManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BorrowingBooksManageController {
    @Autowired
    private BorrowingBooksManageService borrowingBooksManageService;
    @PostMapping("/v1/manage")
    public Page<BorrowingBookManageResponse> searchManage(@RequestBody BorrowingBookManageSearch borrowingBookManageSearch){
        Pageable pageable = PageRequest.of(borrowingBookManageSearch.getPage(),borrowingBookManageSearch.getSize());
        if (borrowingBookManageSearch.getId() == null) return borrowingBooksManageService.getBorrowingBookManageSearchByReaderName(borrowingBookManageSearch,pageable);

        return borrowingBooksManageService.getBorrowingBookManageSearch(borrowingBookManageSearch,pageable);
    }

    @GetMapping("/v1/manage/{id}")
    public BorrowingDetail getBorrowing(@PathVariable Integer id){
        return borrowingBooksManageService.getBorrowing(id);
    }

}
