package com.aplication.aprendizado.domain.universidade.formacao;

import java.math.BigDecimal;

public class Graduado implements CalculaSalario {

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        return salario;
    }

}
