package com.aplication.aprendizado.domain.universidade;

import com.aplication.aprendizado.domain.universidade.formacao.Formacao;
import com.aplication.aprendizado.exception.AlreadyExistsException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.math.BigDecimal;
import java.util.Optional;

public class ProfessorTest {

    @Mock
    private ProfessorRepository repository;

    private ProfessorService service;

    @Captor
    private ArgumentCaptor<Professor> captor;

    @Before
    public void before() {
        MockitoAnnotations.openMocks(this);
        Mockito.when(repository.findByAula("Matématica")).thenReturn(Optional.of(new Professor()));
        service = new ProfessorServiceImp(repository);
    }

    @Test
    public void deveLancarExceptionQuandoTemAMesmaAula() {
        ProfessorForm form = new ProfessorForm();
        form.setAula("Matématica");
        try {
            service.createProfessor(form);
        } catch (Exception e) {
            Mockito.verify(repository,Mockito.never()).save(Mockito.any());
        }
    }

    @Test
    public void deveCriarOProfessor() throws AlreadyExistsException {
        ProfessorForm form = new ProfessorForm();
        var aula = "Artes";
        var nome = "BRUNO JCOSTA";
        form.setAula(aula);
        form.setFormacao(Formacao.GRADUADO);
        form.setNome(nome);
        form.setSalario(new BigDecimal("4.5"));
        Mockito.when(repository.save(Mockito.any())).thenReturn(new Professor());
        service.createProfessor(form);
        Mockito.verify(repository).save(captor.capture());
        var professor = captor.getValue();
        Assert.assertEquals(Formacao.GRADUADO, professor.getFormacao());
        Assert.assertEquals(aula, professor.getAula());
        Assert.assertNotEquals(aula, "Matématica");
        Assert.assertEquals(nome, professor.getNome());
        Assert.assertEquals(new BigDecimal("4.5"), professor.getSalario());
    }


}
