package com.spring.aplication.teste.java11spring252.buscaApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/v1/cpf_4_dev")
public class CpfFourDevController {

    @GetMapping
    public ResponseEntity test() {
        return ResponseEntity.ok("abc");
    }
}
