package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.domain.universidade.formacao.Formacao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProfessorForm {

    private String nome;
    private String aula;
    private Formacao formacao;
    private BigDecimal salario;

}
