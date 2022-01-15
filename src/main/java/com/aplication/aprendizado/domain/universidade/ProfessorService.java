package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.exception.AlreadyHaveException;

public interface ProfessorService {

    ProfessorDTO createProfessor(ProfessorForm form) throws AlreadyHaveException;


}
