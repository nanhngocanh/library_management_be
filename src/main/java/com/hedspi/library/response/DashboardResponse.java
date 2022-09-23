package com.hedspi.library.response;

import java.util.List;

public class DashboardResponse {
    private Long numOfBooks;
    private Long numOfReaders;
    private Long totalImportCost;
    private Long income;
    private Long numOfChildren;
    private Long numOfStudents;
    private Long numOfOtherReaders;
    private Long numOfLostBooks;
    private Long numOfLateBooks;
    private Long numOfBorrowingBooks;
    private Long numOfRemainingBooks;
    private List<ReadersPerMonth> readersPerMonths;
    private List<BorrowingPerMonth> borrowingPerMonths;

    public DashboardResponse(Long numOfBooks, Long numOfReaders, Long totalImportCost, Long income, Long numOfChildren, Long numOfStudents, Long numOfOtherReaders, Long numOfLostBooks, Long numOfLateBooks, Long numOfBorrowingBooks, List<ReadersPerMonth> readersPerMonths, List<BorrowingPerMonth> borrowingPerMonths) {
        this.numOfBooks = numOfBooks;
        this.numOfReaders = numOfReaders;
        this.totalImportCost = totalImportCost;
        this.income = income;
        this.numOfChildren = numOfChildren;
        this.numOfStudents = numOfStudents;
        this.numOfOtherReaders = numOfOtherReaders;
        this.numOfLostBooks = numOfLostBooks;
        this.numOfLateBooks = numOfLateBooks;
        this.numOfBorrowingBooks = numOfBorrowingBooks;
        this.numOfRemainingBooks = numOfBooks - numOfBorrowingBooks - numOfLateBooks - numOfLostBooks;
        this.readersPerMonths = readersPerMonths;
        this.borrowingPerMonths = borrowingPerMonths;
    }

    public Long getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(Long numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public Long getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(Long numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public Long getNumOfOtherReaders() {
        return numOfOtherReaders;
    }

    public void setNumOfOtherReaders(Long numOfOtherReaders) {
        this.numOfOtherReaders = numOfOtherReaders;
    }

    public Long getNumOfLostBooks() {
        return numOfLostBooks;
    }

    public void setNumOfLostBooks(Long numOfLostBooks) {
        this.numOfLostBooks = numOfLostBooks;
    }

    public Long getNumOfLateBooks() {
        return numOfLateBooks;
    }

    public void setNumOfLateBooks(Long numOfLateBooks) {
        this.numOfLateBooks = numOfLateBooks;
    }

    public Long getNumOfBorrowingBooks() {
        return numOfBorrowingBooks;
    }

    public void setNumOfBorrowingBooks(Long numOfBorrowingBooks) {
        this.numOfBorrowingBooks = numOfBorrowingBooks;
    }

    public Long getNumOfRemainingBooks() {
        return numOfRemainingBooks;
    }

    public void setNumOfRemainingBooks(Long numOfRemainingBooks) {
        this.numOfRemainingBooks = numOfRemainingBooks;
    }

    public DashboardResponse(){}

    public List<BorrowingPerMonth> getBorrowingPerMonths() {
        return borrowingPerMonths;
    }

    public void setBorrowingPerMonths(List<BorrowingPerMonth> borrowingPerMonths) {
        this.borrowingPerMonths = borrowingPerMonths;
    }

    public List<ReadersPerMonth> getReadersPerMonths() {
        return readersPerMonths;
    }

    public void setReadersPerMonths(List<ReadersPerMonth> readersPerMonths) {
        this.readersPerMonths = readersPerMonths;
    }

    public Long getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(Long numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public Long getNumOfReaders() {
        return numOfReaders;
    }

    public void setNumOfReaders(Long numOfReaders) {
        this.numOfReaders = numOfReaders;
    }

    public Long getTotalImportCost() {
        return totalImportCost;
    }

    public void setTotalImportCost(Long totalImportCost) {
        this.totalImportCost = totalImportCost;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }
}
