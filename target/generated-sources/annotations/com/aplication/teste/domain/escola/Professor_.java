package com.aplication.teste.domain.escola;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Professor.class)
public abstract class Professor_ {

	public static volatile SingularAttribute<Professor, String> aula;
	public static volatile SingularAttribute<Professor, BigDecimal> salario;
	public static volatile SingularAttribute<Professor, String> nome;
	public static volatile SingularAttribute<Professor, Long> id;
	public static volatile SingularAttribute<Professor, Escolaridade> escolaridade;

	public static final String AULA = "aula";
	public static final String SALARIO = "salario";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String ESCOLARIDADE = "escolaridade";

}

