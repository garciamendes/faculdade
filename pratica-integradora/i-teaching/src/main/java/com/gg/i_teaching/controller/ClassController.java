package com.gg.i_teaching.controller;

import com.gg.i_teaching.dto.ClassDTO;
import com.gg.i_teaching.model.Class;
import com.gg.i_teaching.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping
    public ResponseEntity<Void> createClass(@RequestBody ClassDTO data) throws Exception {
        this.classService.create(data);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Class>> listClasses() {
        List<Class> listClasses = this.classService.getAllClasses();
        return new ResponseEntity<>(listClasses, HttpStatus.OK);
    }
}
