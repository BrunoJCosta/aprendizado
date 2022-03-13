package com.aplication.aprendizado.domain.universidade;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MateriaServiceImp implements MateriaService{

    private MateriaRepository repository;

    @Override
    public List<MateriaView> findByProfessor(Long id) {
        return repository.findByProfessor(id);
    }

}
