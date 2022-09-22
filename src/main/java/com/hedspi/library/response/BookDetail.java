package com.hedspi.library.response;

import java.time.LocalDate;
import java.util.List;

public class BookDetail {
    private Integer id;
    private String name;
    private String imageUrl;

    private List<String> authorsName;
    private String description;
    private String publisher;
    private Integer publishYear;
    private String categoryName;
    private String language;
    private Integer floor;
    private String room;
    private String row;

    private Long availableQuantity;

    private String supplierName;
    private LocalDate supplyDate;
    private Integer quantity;
    private Integer importCost;
    private Integer retailPrice;

    public BookDetail(Integer id, String name, String imageUrl, String description, String publisher, Integer publishYear, String categoryName, String language, Integer floor, String room, String row, Long availableQuantity, String supplierName, LocalDate supplyDate, Integer quantity, Integer importCost, Integer retailPrice) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.categoryName = categoryName;
        this.language = language;
        this.floor = floor;
        this.room = room;
        this.row = row;
        this.availableQuantity = availableQuantity;
        this.supplierName = supplierName;
        this.supplyDate = supplyDate;
        this.quantity = quantity;
        this.importCost = importCost;
        this.retailPrice = retailPrice;
    }

    public BookDetail(Integer id, String name, String imageUrl, List<String> authorsName, String description, String publisher, Integer publishYear, String categoryName, String language, Integer floor, String room, String row, Long availableQuantity, String supplierName, LocalDate supplyDate, Integer quantity, Integer importCost, Integer retailPrice) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.authorsName = authorsName;
        this.description = description;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.categoryName = categoryName;
        this.language = language;
        this.floor = floor;
        this.room = room;
        this.row = row;
        this.availableQuantity = availableQuantity;
        this.supplierName = supplierName;
        this.supplyDate = supplyDate;
        this.quantity = quantity;
        this.importCost = importCost;
        this.retailPrice = retailPrice;
    }

    public BookDetail(){}

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(List<String> authorsName) {
        this.authorsName = authorsName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public LocalDate getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(LocalDate supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getImportCost() {
        return importCost;
    }

    public void setImportCost(Integer importCost) {
        this.importCost = importCost;
    }

    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }
}
