package com.gg.i_teaching.service;

import com.gg.i_teaching.dto.InstructorDTO;
import com.gg.i_teaching.model.Instructor;
import com.gg.i_teaching.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    public void create(InstructorDTO data) {
        Instructor newInstructor = new Instructor(data);

        newInstructor.setCreated(LocalDateTime.now());
        this.instructorRepository.save(newInstructor);
    }

    public Optional<Instructor> getInstructor(String rg) {
        return this.instructorRepository.getInstructorByRg(rg);
    }
}
