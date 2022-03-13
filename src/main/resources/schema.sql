create table if not exists aluno(
    id bigint not null primary key,
    nome varchar(255),
    matricula varchar(9),
    materia_id bigInt,
    date_matricula timestamp default current_timestamp
);

create table if not exists materia(
    id bigint not null primary key,
    nome varchar(255),
    matricula varchar(9),
    creditos int,
    professor_id bigInt
);

create table if not exists professor(
    id bigint not null primary key,
    nome varchar(255),
    aula varchar(50),
    formacao varchar(20),
    salario decimal(5,3)
);