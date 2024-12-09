package br.com.ltoledo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ltoledo.domain.Curso;


public interface ICursoRepository extends MongoRepository<Curso, String>{

}