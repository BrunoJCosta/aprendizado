package com.aplication.aprendizado.domain.universidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Optional<Professor> findByAula(String aula);

}
