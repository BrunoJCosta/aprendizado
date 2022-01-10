package com.aplication.teste.domain.universidade.formacao;

import com.aplication.teste.domain.universidade.formacao.Formacao;

import java.math.BigDecimal;

public class Graduado implements Formacao {

    @Override
    public BigDecimal calcular(BigDecimal salario) {
        return salario;
    }

}
