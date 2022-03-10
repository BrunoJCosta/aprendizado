package com.aplication.aprendizado.domain.universidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface MateriaRepository extends JpaRepository<Materia,Long> {

    List<MateriaView> findByProfessor(Long id);

}
