package com.aplication.aprendizado.controller;

import com.aplication.aprendizado.requests.FourDev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/find_documentos")
public class GeradorDocumentos {

    private final FourDev fourDev;

    @Autowired
    public GeradorDocumentos(FourDev fourDev) {
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