package com.aplication.aprendizado.domain.universidade.formacao;

import java.math.BigDecimal;

public class PosGraduado implements CalculaSalario {

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        BigDecimal valor = new BigDecimal("1.2");
        return salario.multiply(valor);
    }
}
