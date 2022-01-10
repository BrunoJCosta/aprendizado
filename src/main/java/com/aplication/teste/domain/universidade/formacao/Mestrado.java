package com.aplication.teste.domain.universidade.formacao;

import java.math.BigDecimal;

public class Mestrado implements Formacao{

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        BigDecimal valor = new BigDecimal("1,35");
        return salario.multiply(valor);
    }
}
