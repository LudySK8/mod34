package br.com.ltoledo.dao;

import java.util.List;

import br.com.ltoledo.domain.Curso;

public interface ICursoDao {

    public Curso cadastrar(Curso curso);

    public void excluir(Curso cur);

    public List<Curso> buscarTodos();
}