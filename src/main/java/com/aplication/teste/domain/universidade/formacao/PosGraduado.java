package com.aplication.teste.domain.universidade.formacao;

import com.aplication.teste.domain.universidade.formacao.Formacao;

import java.math.BigDecimal;

public class PosGraduado implements Formacao {

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        BigDecimal valor = new BigDecimal("1,2");
        return salario.multiply(valor);
    }
}
