package com.hedspi.library.service;

import com.hedspi.library.model.Supplier;
import com.hedspi.library.repository.SupplierRepository;
import com.hedspi.library.request.SupplierSearchRequest;
import com.hedspi.library.response.SuppilerSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public Page<SuppilerSearch> suppilerSearch(SupplierSearchRequest supplierSearchRequest, Pageable pageable){
        return supplierRepository.supplierSearch(supplierSearchRequest.getSearchContent(),pageable);
    }

    public Optional<Supplier> findById(String id){
        return supplierRepository.findById(id);
    }
}
