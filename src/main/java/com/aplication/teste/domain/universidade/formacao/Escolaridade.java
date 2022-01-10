package com.aplication.teste.domain.universidade.formacao;

import lombok.Getter;

public enum Escolaridade {

    GRADUADO(new Graduado()),
    POSGRADUADO(new PosGraduado()),
    MESTRADO(new Mestrado()),
    DOUTORADO(new Doutorado()),
    POSDOUTORADO(new PosDoutor());

    @Getter
    private final Formacao value;

    Escolaridade(Formacao value) {
        this.value = value;
    }

}
