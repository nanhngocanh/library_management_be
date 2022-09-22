package com.hedspi.library.repository;

import com.hedspi.library.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, String> {
}