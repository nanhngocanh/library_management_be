package com.hedspi.library.repository;

import com.hedspi.library.model.Book;
import com.hedspi.library.response.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "select distinct language from Book order by language asc ")
    List<String> getLanguages();

    @Query(value = "select distinct year from Book order by year asc ")
   List<Integer> getPublishYears();

    @Query(value = "select distinct publisher from Book order by publisher asc ")
    List<String> getPublishers();

    @Query(value = "select distinct floor from Book order by floor asc ")
    List<Integer> getFloors();

    @Query(value = "select distinct room from Book order by room asc ")
    List<String> getRooms();

    @Query("select distinct row from Book order by row asc ")
    List<String> getRows();

    @Query("select distinct new com.hedspi.library.response.BookSearch(b.id, b.name, b.description, b.imageUrl) " +
            "from BookAuthor ba join ba.book b join b.category c where c.type like %:parentCategory% and b.category.id like %:childCategoryId% and ba.author.id in :authorId and b.language like %:language% and b.year in :publishYear and b.publisher like %:publisher% and b.floor in :floor and b.room like %:room% and b.row like %:row% order by b.name asc")
    Page<BookSearch> getBookSearch(String parentCategory, String childCategoryId, List<Integer> authorId, String language, List<Integer> publishYear, String publisher, List<Integer> floor, String room, String row, Pageable pageable);

    @Query("select new com.hedspi.library.response.BookDetail(b.id, b.name, b.imageUrl,b.description,b.publisher,b.year,c.name, b.language, b.floor,b.room,b.row,b.quantity - sum(bbd.quantity) + sum(bbd.returned), s.name, b.supplyDate, b.quantity,b.importCost, b.retailPrice)" +
        "from BorrowingBooksDetail bbd join bbd.book b join b.category c join b.supplier s where b.id = :id")
    BookDetail getBookDetail(Integer id);

    @Query("select quantity from Book where id=:id")
    int getBookQuantityById(Integer id);

    @Query("select distinct new com.hedspi.library.response.BorrowingDetailByBook(bbm.id, r.name, bbd.quantity, bbm.returnAppointment) from BorrowingBooksDetail bbd join bbd.borrowingBooksManage bbm join bbm.reader r where bbd.bookId=:bookId order by bbm.returnAppointment asc ")
    Page<BorrowingDetailByBook> getBorrowingDetailByBook(Integer bookId, Pageable pageable);

    @Query("select distinct new com.hedspi.library.response.SuppliedBook(b.id, b.name, b.supplyDate, b.quantity, b.importCost) from Book b join b.supplier s where s.id like %:supplierId%")
    Page<SuppliedBook> getSuppliedBookBySupplier(String supplierId, Pageable pageable);

    @Query("select sum(b.quantity) from Book b")
    long getNumOfBooks();

    @Query("select count(r) from Reader r")
    long getNumOfReaders();

    @Query("select sum(b.importCost) from Book b")
    long getTotalImportCost();

    @Query(value = "select sum(year(exp_date) - year(activation_date))*100000 from reader where type = 'TE'",nativeQuery = true)
    long getTotalFeeOfChildren();

    @Query(value = "select sum(year(exp_date) - year(activation_date))*150000 from reader where type = 'SV'",nativeQuery = true)
    long getTotalFeeOfStudents();

    @Query(value = "select sum(year(exp_date) - year(activation_date))*200000 from reader where type = 'T'",nativeQuery = true)
    long getTotalFeeOfOthers();

    @Query("select sum(total) from Forfeit ")
    long getTotalForfeit();

    @Query(value = "select new com.hedspi.library.response.ReadersPerMonth(substring(r.activationDate,1,7), count(r)) from Reader r group by substring(r.activationDate,1,7) order by substring(r.activationDate,1,7) asc")
    List<ReadersPerMonth> getReadersPerMonth();

    @Query(value = "select new com.hedspi.library.response.BorrowingPerMonth(substring(bbm.start,1,7), count(bbm)) from BorrowingBooksManage bbm group by substring(bbm.start,1,7) order by substring(bbm.start,1,7) asc")
    List<BorrowingPerMonth> getBorrowingPerMonth();

    @Query("select count(r) from Reader r where r.type = 'TE'")
    long getNumOfChildrenReaders();
    @Query("select count(r) from Reader r where r.type = 'SV'")
    long getNumOfStudentReaders();
    @Query("select count(r) from Reader r where r.type = 'T'")
    long getNumOfOtherReaders();

    @Query(value = "SELECT SUM(lost) from borrowing_books_detail", nativeQuery = true)
    long getNumOfLostBooks();

    @Query(value = "SELECT SUM(borrowing_books_detail.quantity) from borrowing_books_detail,borrowing_books_manage WHERE borrowing_books_detail.borrowing_books_id = borrowing_books_manage.id AND borrowing_books_manage.return_date IS NULL AND borrowing_books_manage.return_appointment>=CURDATE()",nativeQuery = true)
    long getNumOfBorrowingBooks();

    @Query(value = "SELECT SUM(borrowing_books_detail.quantity) from borrowing_books_detail,borrowing_books_manage WHERE borrowing_books_detail.borrowing_books_id = borrowing_books_manage.id AND borrowing_books_manage.return_date IS NULL AND borrowing_books_manage.return_appointment<CURDATE()",nativeQuery = true)
    long getNumOfLateBooks();

}