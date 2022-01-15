package com.aplication.aprendizado.domain.universidade.formacao;

import java.math.BigDecimal;

public class Doutorado implements CalculaSalario {

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        BigDecimal valor = new BigDecimal("1.5");
        return salario.multiply(valor);
    }
}
