package com.aplication.teste.domain.universidade;

import com.aplication.teste.domain.universidade.formacao.Escolaridade;

import java.math.BigDecimal;

public class ProfessorDTO {

    private Long id;
    private String nome;
    private String aula;
    private Escolaridade escolaridade;
    private BigDecimal salario;

    public ProfessorDTO(Professor save) {
        this.id = save.getId();
        this.nome = save.getNome();
        this.aula = save.getAula();
        this.escolaridade = save.getEscolaridade();
        this.salario = save.getSalario();
    }
}
