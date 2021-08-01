package com.spring.aplication.teste.java11spring252.buscaApi;

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

    @PostMapping
    public ResponseEntity test(@RequestParam boolean isPontuacao) {
        return ResponseEntity.ok(fourDev.gerarCpf(isPontuacao));
    }
}
