package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.domain.universidade.formacao.Formacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "professor", schema = "postgres")
@SequenceGenerator(
        name = "professor_gen",
        sequenceName = "professor_seq",
        allocationSize = 1,
        schema = "postgres"
)
class Professor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_gen")
    @Getter
    private Long id;

    @Column(name = "nome")
    @Getter
    @Setter
    private String nome;

    @Column(name = "aula")
    @Getter
    @Setter
    private String aula;

    @Column(name = "formacao")
    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private Formacao formacao;

    @Column(name = "salario")
    @Getter
    @Setter
    private BigDecimal salario;

}