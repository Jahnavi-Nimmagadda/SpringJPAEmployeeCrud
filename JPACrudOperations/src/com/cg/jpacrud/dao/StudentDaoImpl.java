package com.cg.jpacrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.jpacrud.entities.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
@PersistenceContext
	private EntityManager entityManager;



	@Override
	@Transactional
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	@Transactional
	public void removeStudent(Student student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	
}
