package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.exception.AlreadyHaveException;
import com.aplication.aprendizado.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<String> findAllAula() {
        return repository.findAll().stream().map(Professor::getAula).collect(Collectors.toList());
    }

    @Override
    public Professor findProfessorByAula(String aula) throws NotFoundException {
        return repository.findByAula(aula).orElseThrow(() -> new NotFoundException("Professor com essa aula"));
    }

    @Override
    public Professor findById(Long id) throws NotFoundException {
        return repository.findById(id).orElseThrow( () -> new NotFoundException("Professor"));
    }

}
