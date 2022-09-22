package com.hedspi.library.controller;

import com.hedspi.library.model.Supplier;
import com.hedspi.library.request.SupplierSearchRequest;
import com.hedspi.library.response.SuppilerSearch;
import com.hedspi.library.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/v1/suppliers")
    public Page<SuppilerSearch> suppilerSearch(@RequestBody SupplierSearchRequest supplierSearchRequest){
        Pageable pageable = PageRequest.of(supplierSearchRequest.getPage(),supplierSearchRequest.getSize());
        return supplierService.suppilerSearch(supplierSearchRequest,pageable);
    }
    @GetMapping("/v1/suppliers/{id}")
    public Optional<Supplier> findById(@PathVariable String id){
        return supplierService.findById(id);
    }
}
