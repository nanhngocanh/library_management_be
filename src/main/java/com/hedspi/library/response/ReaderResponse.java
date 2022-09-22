package com.hedspi.library.response;

import com.hedspi.library.model.BorrowingBooksManage;
import com.hedspi.library.model.Reader;

import java.util.List;
import java.util.Optional;

public class ReaderResponse {
    private Optional<Reader> reader;
    private List<ReaderBorrowingBook> borrowingBooksManages;

    public ReaderResponse(Optional<Reader> reader, List<ReaderBorrowingBook> borrowingBooksManages) {
        this.reader = reader;
        this.borrowingBooksManages = borrowingBooksManages;
    }

    public ReaderResponse(){}

    public Optional<Reader> getReader() {
        return reader;
    }

    public void setReader(Optional<Reader> reader) {
        this.reader = reader;
    }

    public List<ReaderBorrowingBook> getBorrowingBooksManages() {
        return borrowingBooksManages;
    }

    public void setBorrowingBooksManages(List<ReaderBorrowingBook> borrowingBooksManages) {
        this.borrowingBooksManages = borrowingBooksManages;
    }
}
