package com.hedspi.library.repository;

import com.hedspi.library.model.Supplier;
import com.hedspi.library.response.SuppilerSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SupplierRepository extends JpaRepository<Supplier, String> {
    @Query("select distinct new com.hedspi.library.response.SuppilerSearch(s.id, s.name, s.address, sum(b.quantity)) from Book b join b.supplier s where s.id like %:content% or s.name like %:content% or s.address like %:content% group by s.id order by s.id asc ")
    Page<SuppilerSearch> supplierSearch(String content,Pageable pageable);

}