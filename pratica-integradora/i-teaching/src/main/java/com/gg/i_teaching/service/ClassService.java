package com.gg.i_teaching.service;

import com.gg.i_teaching.dto.ClassDTO;
import com.gg.i_teaching.model.Class;
import com.gg.i_teaching.model.Instructor;
import com.gg.i_teaching.repository.ClassRepository;
import com.gg.i_teaching.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private InstructorRepository instructorRepository;

    public void create(ClassDTO data) throws Exception {
        Instructor instructor =
                this.instructorRepository.getInstructorById(data.instructorId())
                        .orElseThrow(() -> new RuntimeException("Instructor not found"));

        Class newClass = new Class(data, instructor);

        newClass.setCreated(LocalDateTime.now());
        this.classRepository.save(newClass);
    }

    public List<Class> getAllClasses() {
        return this.classRepository.findAll();
    }

}
