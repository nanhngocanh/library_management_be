package com.hedspi.library.service;

import com.hedspi.library.model.BorrowingBooksManage;
import com.hedspi.library.repository.BorrowingBooksManageRepository;
import com.hedspi.library.request.BorrowingBookManageSearch;
import com.hedspi.library.response.BorrowingBookManageResponse;
import com.hedspi.library.response.BorrowingBooksDetail.Detail;
import com.hedspi.library.response.BorrowingBooksDetail.General;
import com.hedspi.library.response.BorrowingDetail;
import com.hedspi.library.response.ReaderBorrowingBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowingBooksManageService {
    @Autowired
    private BorrowingBooksManageRepository borrowingBooksManageRepository;

    public Page<BorrowingBookManageResponse> getBorrowingBookManageSearch(BorrowingBookManageSearch borrowingBookManageSearch, Pageable pageable){
        return borrowingBooksManageRepository.getBorrowingBooksManageSearch(borrowingBookManageSearch.getId(),borrowingBookManageSearch.getReaderName(),pageable);
    }

    public Page<BorrowingBookManageResponse> getBorrowingBookManageSearchByReaderName(BorrowingBookManageSearch borrowingBookManageSearch, Pageable pageable){
        return borrowingBooksManageRepository.getBorrowingBooksManageSearchByReaderName(borrowingBookManageSearch.getReaderName(),pageable);
    }

    public Optional<General> getBorrowingGeneral(Integer id){
        return borrowingBooksManageRepository.getBorrowingGeneral(id);
    }

    public List<Detail> getBorrowingDetails(Integer id){
        return borrowingBooksManageRepository.getBorrowingDetails(id);

    }

    public BorrowingDetail getBorrowing(Integer id){
        BorrowingDetail borrowingDetail = new BorrowingDetail();
        borrowingDetail.setGeneral(borrowingBooksManageRepository.getBorrowingGeneral(id));
        borrowingDetail.setDetails(borrowingBooksManageRepository.getBorrowingDetails(id));
        return borrowingDetail;
    }

    public List<ReaderBorrowingBook> findByReaderId(Integer id){
        return borrowingBooksManageRepository.findByReaderId(id);
    }

}
