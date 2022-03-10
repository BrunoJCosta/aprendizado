package com.aplication.aprendizado.domain.universidade;

import java.util.List;

public interface MateriaService {

    List<MateriaView> findByProfessor(Long id);
}
