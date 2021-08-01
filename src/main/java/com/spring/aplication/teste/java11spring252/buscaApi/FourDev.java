package com.spring.aplication.teste.java11spring252.buscaApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class FourDev {

    private final WebClient webClientForDev;

    @Autowired
    public FourDev(WebClient webClientForDev) {
        this.webClientForDev = webClientForDev;
    }

    public String gerarCpf(boolean isPontuacao) {
        var pontuacao = isPontuacao ? "S" : "N";
        var gerarCpf = webClientForDev
                .post().body(BodyInserters
                        .fromFormData("acao","gerar_cpf")
                        .with("pontuacao",pontuacao))
                .retrieve()
                .bodyToMono(String.class);

        return gerarCpf.block();
    }

}
