package com.aplication.aprendizado.controller;

import com.aplication.aprendizado.domain.universidade.ProfessorForm;
import com.aplication.aprendizado.domain.universidade.ProfessorService;
import com.aplication.aprendizado.exception.AlreadyHaveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/v1/professor")
public class ProfessorController {

    private final ProfessorService service;

    @Autowired
    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity createProfessor(@RequestBody ProfessorForm form) {
        var professor = service.createProfessor(form);
        return ResponseEntity.ok(professor);
    }

    @GetMapping("/aulas")
    public ResponseEntity findAllAulas() {
        var aulas = service.findAllAula();
        return ResponseEntity.ok(aulas);
    }
}
