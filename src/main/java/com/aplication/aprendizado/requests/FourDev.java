package com.aplication.aprendizado.requests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class FourDev {

    private final WebClient webClientFourDev;

    @Autowired
    public FourDev(WebClient webClientFourDev) {
        this.webClientFourDev = webClientFourDev;
    }

    public String gerarCpf(boolean isPontuacao) {
        var pontuacao = isPontuacao ? "S" : "N";
        var gerarCpf = webClientFourDev
                .post().body(BodyInserters
                        .fromFormData("acao","gerar_cpf")
                        .with("pontuacao",pontuacao))
                .retrieve()
                .bodyToMono(String.class);

        return gerarCpf.block();
    }

    public String validaCpf(String cpf) {
        var gerarCpf = webClientFourDev
                .post().body(BodyInserters
                        .fromFormData("acao","validar_cpf")
                        .with("txt_cpf",cpf))
                .retrieve()
                .bodyToMono(String.class);

        return gerarCpf.block();
    }

}
