package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.domain.universidade.formacao.Formacao;

import java.math.BigDecimal;

public class ProfessorDTO {

    private Long id;
    private String nome;
    private String aula;
    private Formacao formacao;
    private BigDecimal salario;

    public ProfessorDTO(Professor save) {
        this.id = save.getId();
        this.nome = save.getNome();
        this.aula = save.getAula();
        this.formacao = save.getFormacao();
        this.salario = save.getSalario();
    }
}
