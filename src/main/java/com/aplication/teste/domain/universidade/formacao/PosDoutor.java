package com.aplication.teste.domain.universidade.formacao;

import java.math.BigDecimal;

public class PosDoutor implements CalculaSalario {

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        BigDecimal valor = new BigDecimal("1.75");
        return salario.multiply(valor);
    }
}
