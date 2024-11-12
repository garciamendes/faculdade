package com.gg.i_teaching.controller;

import com.gg.i_teaching.dto.InstructorDTO;
import com.gg.i_teaching.model.Instructor;
import com.gg.i_teaching.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @PostMapping
    public ResponseEntity<Void> createInstructor(@RequestBody InstructorDTO data) {
        this.instructorService.create(data);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{rg}")
    public ResponseEntity<Optional<Instructor>> getFindInstructor(@PathVariable String rg) {
        Optional<Instructor> instructor = this.instructorService.getInstructor(rg);

        return new ResponseEntity<>(instructor, HttpStatus.OK);
    }
}
