package br.com.ltoledo.dao;

import java.util.List;

import br.com.ltoledo.domain.Curso;
import br.com.ltoledo.domain.Matricula;

public class MatriculaDao implements IMatriculaDao {

    @Override
    public Matricula cadastrar(Matricula mat) {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		entityManager.getTransaction().begin();
//		entityManager.persist(mat);
//		entityManager.getTransaction().commit();
//
//		entityManager.close();
//		entityManagerFactory.close();
//		return mat;
        return null;
    }

    @Override
    public Matricula buscarPorCodigoCurso(String codigoCurso) {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		StringBuilder sb = new StringBuilder();
//		sb.append("SELECT m FROM Matricula m ");
//		sb.append("INNER JOIN Curso c on c = m.curso ");
//		sb.append("WHERE c.codigo = :codigoCurso");
//
//		entityManager.getTransaction().begin();
//		TypedQuery<Matricula> query =
//				entityManager.createQuery(sb.toString(), Matricula.class);
//		query.setParameter("codigoCurso", codigoCurso);
//		Matricula matricula = query.getSingleResult();
//
//		entityManager.close();
//		entityManagerFactory.close();
//
//		return matricula;
        return null;
    }

    @Override
    public Matricula buscarPorCurso(Curso curso) {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		StringBuilder sb = new StringBuilder();
//		sb.append("SELECT m FROM Matricula m ");
//		sb.append("INNER JOIN Curso c on c = m.curso ");
//		sb.append("WHERE c = :curso");
//
//		entityManager.getTransaction().begin();
//		TypedQuery<Matricula> query =
//				entityManager.createQuery(sb.toString(), Matricula.class);
//		query.setParameter("curso", curso);
//		Matricula matricula = query.getSingleResult();
//
//		entityManager.close();
//		entityManagerFactory.close();
//
//		return matricula;
        return null;
    }

    @Override
    public Matricula buscarPorCodigoCursoCriteria(String codigoCurso) {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
//		Root<Matricula> root = query.from(Matricula.class);
//		Join<Object, Object> join = root.join("curso", JoinType.INNER);
//		query.select(root).where(builder.equal(join.get("codigo"), codigoCurso));
//
//		TypedQuery<Matricula> tpQuery =
//				entityManager.createQuery(query);
//		Matricula matricula = tpQuery.getSingleResult();
//
//		entityManager.close();
//		entityManagerFactory.close();
//
//		return matricula;
        return null;
    }

    @Override
    public Matricula buscarPorCursoCriteria(Curso curso) {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
//		Root<Matricula> root = query.from(Matricula.class);
//		Join<Object, Object> join = root.join("curso", JoinType.INNER);
//		query.select(root).where(builder.equal(join, curso));
//
//		TypedQuery<Matricula> tpQuery =
//				entityManager.createQuery(query);
//		Matricula matricula = tpQuery.getSingleResult();
//
//		entityManager.close();
//		entityManagerFactory.close();
//
//		return matricula;
        return null;
    }

    @Override
    public List<Matricula> buscarTodos() {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
//		Root<Matricula> root = query.from(Matricula.class);
//		query.select(root);
//
//		TypedQuery<Matricula> tpQuery =
//				entityManager.createQuery(query);
//		List<Matricula> list = tpQuery.getResultList();
//
//		entityManager.close();
//		entityManagerFactory.close();
//		return list;
        return null;
    }

    @Override
    public void excluir(Matricula matricula) {
//		EntityManagerFactory entityManagerFactory =
//				Persistence.createEntityManagerFactory("ExemploJPA");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		entityManager.getTransaction().begin();
//		matricula = entityManager.merge(matricula);
//		entityManager.remove(matricula);
//		entityManager.getTransaction().commit();
//
//		entityManager.close();
//		entityManagerFactory.close();
    }

}