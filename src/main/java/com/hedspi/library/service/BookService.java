package com.hedspi.library.service;

import com.hedspi.library.repository.BookAuthorRepository;
import com.hedspi.library.repository.BookRepository;
import com.hedspi.library.repository.BorrowingBooksDetailRepository;
import com.hedspi.library.request.BookSearchRequest;
import com.hedspi.library.request.PageSize;
import com.hedspi.library.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookAuthorRepository bookAuthorRepository;
    @Autowired
    private BorrowingBooksDetailRepository borrowingBooksDetailRepository;

    public List<String> getLanguages(){
        return bookRepository.getLanguages();
    }

    public List<Integer> getPublishYears(){
        return bookRepository.getPublishYears();
    }

    public List<String> getPublishers(){
        return bookRepository.getPublishers();
    }

    public List<Integer> getFloors(){
        return bookRepository.getFloors();
    }

    public List<String> getRooms(){
        return bookRepository.getRooms();
    }

    public List<String> getRows(){
        return bookRepository.getRows();
    }

    public Page<BookSearch> getBookSearch(BookSearchRequest bookSearchRequest, Pageable pageable){

        return bookRepository.getBookSearch(bookSearchRequest.getParentCategory(), bookSearchRequest.getChildCategoryId(), bookSearchRequest.getAuthorId(), bookSearchRequest.getLanguage(), bookSearchRequest.getPublishYear(), bookSearchRequest.getPublisher(), bookSearchRequest.getFloor(), bookSearchRequest.getRoom(), bookSearchRequest.getRow(),pageable);
    }

    public BookDetail getBookDetail(Integer id) {
        BookDetail bookDetail = bookRepository.getBookDetail(id);
        bookDetail.setAuthorsName(bookAuthorRepository.getAuthorsByBookId(id));
        if (bookDetail.getQuantity() == null) bookDetail.setQuantity(bookRepository.getBookQuantityById(id));
        return bookDetail;
    }

    public Page<BorrowingDetailByBook> getBorrowingDetailByBook(Integer bookId, Pageable pageable){
        return bookRepository.getBorrowingDetailByBook(bookId,pageable);
    }

    public Page<SuppliedBook> getSuppliedBookBySupplier(String supplierId, Pageable pageable){
        return bookRepository.getSuppliedBookBySupplier(supplierId,pageable);
    }

    public List<BookRating> getTopBooks(){
        return borrowingBooksDetailRepository.getTopBooks().subList(0,5);
    }

    public DashboardResponse getNumbers(){
        return new DashboardResponse(bookRepository.getNumOfBooks(),bookRepository.getNumOfReaders(),bookRepository.getTotalImportCost(),bookRepository.getTotalFeeOfChildren() + bookRepository.getTotalFeeOfStudents() + bookRepository.getTotalFeeOfOthers() + bookRepository.getTotalForfeit(),bookRepository.getNumOfChildrenReaders(),bookRepository.getNumOfStudentReaders(),bookRepository.getNumOfOtherReaders(),bookRepository.getNumOfLostBooks(),bookRepository.getNumOfLateBooks(),bookRepository.getNumOfBorrowingBooks(), bookRepository.getReadersPerMonth(),bookRepository.getBorrowingPerMonth());
    }
}
