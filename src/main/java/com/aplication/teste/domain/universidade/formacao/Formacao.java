package com.aplication.teste.domain.universidade.formacao;

import lombok.Getter;

public enum Formacao {

    GRADUADO("Graduado"),
    POSGRADUADO("Pós-Graduado"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado"),
    POSDOUTORADO("Pos-Doutorado");

    @Getter
    private String value;

    Formacao(String value) {
        this.value = value;
    }
}
