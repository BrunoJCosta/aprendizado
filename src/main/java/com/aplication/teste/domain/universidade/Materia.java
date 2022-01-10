package com.aplication.teste.domain.universidade;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "materia")
@SequenceGenerator(
        name = "materia_gen",
        sequenceName = "materia_seq",
        allocationSize = 1,
        schema = "postgres"
)
class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "materia_gen")
    @Column(name = "id")
    @Getter
    private Long id;

    @Column(name = "nome")
    @Getter
    @Setter
    private String nome;

    @Column(name = "creditos")
    @Getter
    @Setter
    private Integer creditos;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "professor_id", referencedColumnName = "id",
        foreignKey = @ForeignKey(name = "professor_fk"))
    @Fetch(FetchMode.JOIN)
    @Getter
    @Setter
    private Professor professor;

}
