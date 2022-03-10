package com.aplication.aprendizado.domain.universidade;

import java.util.List;

class MateriaServiceImp implements MateriaService{

    private MateriaRepository repository;

    @Override
    public List<MateriaView> findByProfessor(Long id) {
        return repository.findByProfessor(id);
    }

}
