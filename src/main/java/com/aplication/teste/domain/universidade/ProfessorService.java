package com.aplication.teste.domain.universidade;

import com.aplication.teste.exception.AlreadyHaveException;

public interface ProfessorService {

    ProfessorDTO createProfessor(ProfessorForm form) throws AlreadyHaveException;


}
