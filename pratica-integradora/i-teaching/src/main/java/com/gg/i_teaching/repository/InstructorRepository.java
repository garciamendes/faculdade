package com.gg.i_teaching.repository;

import com.gg.i_teaching.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Optional<Instructor> getInstructorByRg(String rg);
    Optional<Instructor> getInstructorById(Long id);
}
