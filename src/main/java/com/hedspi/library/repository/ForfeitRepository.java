package com.hedspi.library.repository;

import com.hedspi.library.model.Forfeit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForfeitRepository extends JpaRepository<Forfeit, Integer> {
}