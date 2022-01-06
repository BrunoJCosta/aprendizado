package com.aplication.teste.domain.escola;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ {

	public static volatile SingularAttribute<Aluno, LocalDateTime> dateMatricula;
	public static volatile SingularAttribute<Aluno, String> matricula;
	public static volatile SingularAttribute<Aluno, String> nome;
	public static volatile SingularAttribute<Aluno, Materia> materia;
	public static volatile SingularAttribute<Aluno, Long> id;

	public static final String DATE_MATRICULA = "dateMatricula";
	public static final String MATRICULA = "matricula";
	public static final String NOME = "nome";
	public static final String MATERIA = "materia";
	public static final String ID = "id";

}

