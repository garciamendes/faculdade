package com.gg.i_teaching.repository;

import com.gg.i_teaching.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClassRepository extends JpaRepository<Class, Long> {
    Optional<Class> getClassById(Long id);
}
