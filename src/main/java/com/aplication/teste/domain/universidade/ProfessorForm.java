package com.aplication.teste.domain.universidade;

import com.aplication.teste.domain.universidade.formacao.Escolaridade;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProfessorForm {

    private String nome;
    private String aula;
    private Escolaridade escolaridade;
    private BigDecimal salario;

}
