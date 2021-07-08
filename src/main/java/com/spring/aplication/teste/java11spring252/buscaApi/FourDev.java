package com.spring.aplication.teste.java11spring252.buscaApi;

import org.springframework.web.reactive.function.client.WebClient;

public class FourDev {

    private String gerarCpf() {
        WebClient webClient = WebClient.create("https://www.4devs.com.br");
        return null;
    }

}
