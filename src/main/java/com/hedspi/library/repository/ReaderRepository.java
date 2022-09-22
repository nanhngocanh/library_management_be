package com.hedspi.library.repository;

import com.hedspi.library.model.Reader;
import com.hedspi.library.response.ReaderSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface ReaderRepository extends JpaRepository<Reader, Integer> {
    @Query("select distinct new com.hedspi.library.response.ReaderSearch(r.id,r.name,r.phoneNumber,r.email,r.type,rs.status) from BorrowingBooksManage bbm join bbm.reader r, Forfeit f, ReaderStatus rs where bbm.id = f.borrowingBooksId and r.id = rs.id and (r.name like %:keyword% or r.phoneNumber like %:keyword% or r.email like %:keyword%)")
    Page<ReaderSearch> searchReadersByKeyword(String keyword, Pageable pageable);

    @Query("select distinct new com.hedspi.library.response.ReaderSearch(r.id,r.name,r.phoneNumber,r.email,r.type,rs.status) from BorrowingBooksManage bbm join bbm.reader r, Forfeit f, ReaderStatus rs where bbm.id = f.borrowingBooksId and r.id = rs.id and r.id = :id and (r.name like %:keyword% or r.phoneNumber like %:keyword% or r.email like %:keyword%)")
    Page<ReaderSearch> searchReaders(Integer id, String keyword, Pageable pageable);
}