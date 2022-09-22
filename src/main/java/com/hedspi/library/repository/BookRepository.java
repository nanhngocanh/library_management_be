package com.hedspi.library.repository;

import com.hedspi.library.model.Book;
import com.hedspi.library.response.BookDetail;
import com.hedspi.library.response.BookSearch;
import com.hedspi.library.response.BorrowingDetailByBook;
import com.hedspi.library.response.SuppliedBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

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
}