package com.hedspi.library.repository;

import com.hedspi.library.model.BorrowingBooksManage;
import com.hedspi.library.response.BorrowingBookManageResponse;
import com.hedspi.library.response.BorrowingBooksDetail.Detail;
import com.hedspi.library.response.BorrowingBooksDetail.General;
import com.hedspi.library.response.ReaderBorrowingBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BorrowingBooksManageRepository extends JpaRepository<BorrowingBooksManage, Integer> {
    @Query("select distinct new com.hedspi.library.response.BorrowingBookManageResponse(bbm.id, r.name, bbm.start, bbm.returnAppointment, bbm.returnDate, l.name) from BorrowingBooksManage bbm join bbm.reader r join bbm.librarian l where bbm.id = :id and r.name like %:readerName%")
    Page<BorrowingBookManageResponse> getBorrowingBooksManageSearch(Integer id, String readerName, Pageable pageable);

    @Query("select distinct new com.hedspi.library.response.BorrowingBookManageResponse(bbm.id, r.name, bbm.start, bbm.returnAppointment, bbm.returnDate, l.name) from BorrowingBooksManage bbm join bbm.reader r join bbm.librarian l where r.name like %:readerName%")
    Page<BorrowingBookManageResponse> getBorrowingBooksManageSearchByReaderName(String readerName, Pageable pageable);

    @Query("select new com.hedspi.library.response.BorrowingBooksDetail.General(bbm.id, r.id, r.name, bbm.start, bbm.returnAppointment, bbm.returnDate, l.name, sum(bbd.quantity), sum(bbd.quantity * b.retailPrice), f.total) from BorrowingBooksDetail bbd join bbd.book b join bbd.borrowingBooksManage bbm join bbm.reader r join bbm.librarian l, Forfeit f where bbm.id = :id and f.borrowingBooksId = bbm.id")
    Optional<General> getBorrowingGeneral(Integer id);

    @Query("select distinct new com.hedspi.library.response.BorrowingBooksDetail.Detail(b.id, b.name, b.retailPrice, bbd.quantity, bbd.returned,bbd.lost,bbd.damaged) from BorrowingBooksDetail bbd join bbd.book b  where bbd.borrowingBooksManage.id = :id")
    List<Detail> getBorrowingDetails(Integer id);

    @Query("select new com.hedspi.library.response.ReaderBorrowingBook(bbm.id, bbm.start, bbm.returnAppointment, bbm.returnDate) from BorrowingBooksManage bbm where bbm.reader.id = :id and bbm.returnDate is null")
    List<ReaderBorrowingBook> findByReaderId(Integer id);

}