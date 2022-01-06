package com.aplication.teste.domain.escola;

import lombok.Getter;

public enum Escolaridade {

    GRADUADO("Graduado"),
    POSGRADUADO("Pós-Graduado"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado"),
    POSDOUTORADO("Pós-Doutorado");

    @Getter
    private String value;

    Escolaridade(String value) {
        this.value = value;
    }

}
