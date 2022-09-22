package com.hedspi.library.repository;

import com.hedspi.library.model.ReaderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderStatusRepository extends JpaRepository<ReaderStatus, Integer> {
}