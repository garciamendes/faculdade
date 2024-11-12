package com.gg.i_teaching.controller;

import com.gg.i_teaching.dto.InstructorDTO;
import com.gg.i_teaching.model.Instructor;
import com.gg.i_teaching.service.InstructorService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary="Criar um novo instrutor", description  = "Criação de estrutores")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", description = "A requisição foi executada com sucesso."),
//            @ApiResponse(responseCode = "400", description = "Erro ao tentar criar.")})
    public ResponseEntity<Void> createInstructor(@RequestBody InstructorDTO data) {
        this.instructorService.create(data);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{rg}")
//    @Operation(summary="Pegar a instancia", description  = "Focado em pegar o detalhe do instrutor")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Retornando o instrutor."),
//            @ApiResponse(responseCode = "404", description = "Não achado.")})
    public ResponseEntity<Optional<Instructor>> getFindInstructor(@PathVariable String rg) {
        Optional<Instructor> instructor = this.instructorService.getInstructor(rg);

        return new ResponseEntity<>(instructor, HttpStatus.OK);
    }
}
