package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.exception.AlreadyHaveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ProfessorServiceImp implements ProfessorService {

    private final ProfessorRepository repository;

    @Autowired
    ProfessorServiceImp(ProfessorRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProfessorDTO createProfessor(ProfessorForm form) throws AlreadyHaveException {
        var optProfessor = repository.findByAula(form.getAula());
        if (optProfessor.isPresent())
            throw new AlreadyHaveException("Professor");

        var professor = new Professor();
        professor.setAula(form.getAula());
        professor.setNome(form.getNome());
        professor.setFormacao(form.getFormacao());
        professor.setSalario(form.getSalario());

        var save = repository.save(professor);

        return new ProfessorDTO(save);
    }

}
