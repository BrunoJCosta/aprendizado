package com.aplication.teste.domain.escola;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "professor")
@SequenceGenerator(
        name = "professor_gen",
        sequenceName = "professor_seq",
        allocationSize = 1,
        schema = "prostgres"
)
public class Professor {

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

    @Column(name = "escolaridade")
    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private Escolaridade escolaridade;

    @Column(name = "salario")
    @Getter
    @Setter
    private BigDecimal salario;

}