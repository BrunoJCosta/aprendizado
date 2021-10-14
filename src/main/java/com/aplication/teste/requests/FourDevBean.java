package com.aplication.teste.requests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class FourDevBean {

    @Bean
    public WebClient webClientFourDev(WebClient.Builder builder) {
        return builder.baseUrl("https://www.4devs.com.br/ferramentas_online.php")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
