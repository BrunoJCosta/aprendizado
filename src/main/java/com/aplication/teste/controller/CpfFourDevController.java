package com.aplication.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cpf_dev")
public class CpfFourDevController {

    private final FourDev fourDev;

    @Autowired
    public CpfFourDevController(FourDev fourDev) {
        this.fourDev = fourDev;
    }

    @PostMapping("gera_cpf")
    public ResponseEntity test(@RequestParam boolean isPontuacao) {
        return ResponseEntity.ok(fourDev.gerarCpf(isPontuacao));
    }

    @PostMapping("valida_cpf")
    public ResponseEntity test(@RequestParam String cpf) {
        return ResponseEntity.ok(fourDev.validaCpf(cpf));
    }

}
