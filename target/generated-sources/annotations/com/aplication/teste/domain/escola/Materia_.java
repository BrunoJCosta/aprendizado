package com.aplication.teste.domain.escola;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Materia.class)
public abstract class Materia_ {

	public static volatile SingularAttribute<Materia, Professor> professor;
	public static volatile SingularAttribute<Materia, String> nome;
	public static volatile SingularAttribute<Materia, Long> id;
	public static volatile SingularAttribute<Materia, Integer> creditos;

	public static final String PROFESSOR = "professor";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String CREDITOS = "creditos";

}

