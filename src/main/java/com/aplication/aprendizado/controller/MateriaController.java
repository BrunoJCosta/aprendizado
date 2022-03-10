package com.aplication.aprendizado.controller;

import com.aplication.aprendizado.domain.universidade.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/v1/materia")
public class MateriaController {

    private final MateriaService materiaService;

    @Autowired
    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping("/professor/{id}")
    public ResponseEntity findByProfessor(@PathVariable Long id) {
        var materia = materiaService.findByProfessor(id);
        return ResponseEntity.ok(materia);
    }

}
