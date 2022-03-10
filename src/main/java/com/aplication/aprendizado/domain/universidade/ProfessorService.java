package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.exception.NotFoundException;

import java.util.List;

public interface ProfessorService {

    ProfessorDTO createProfessor(ProfessorForm form);

    List<String> findAllAula();

    Professor findProfessorByAula(String aula) throws NotFoundException;

    Professor findById(Long id) throws NotFoundException;


}
