package com.aplication.teste.domain.universidade;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "aluno")
@SequenceGenerator(
        name = "aluno_gen",
        sequenceName = "aluno_seq",
        allocationSize = 1,
        schema = "postgres"
)
class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_gen")
    @Column(name = "id")
    @Getter
    private Long id;

    @Column(name = "nome")
    @Getter
    @Setter
    private String nome;

    @Column(name = "matricula")
    @Getter
    @Setter
    private String matricula;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "materia_id", referencedColumnName = "id",
        foreignKey = @ForeignKey(name = "materia_fk"))
    @Fetch(FetchMode.JOIN)
    @Getter
    @Setter
    private Materia materia;

    @Column(name = "date_matricula")
    private LocalDateTime dateMatricula;

    @PrePersist
    public void prePersiste() {
        dateMatricula = LocalDateTime.now();
    }

}
