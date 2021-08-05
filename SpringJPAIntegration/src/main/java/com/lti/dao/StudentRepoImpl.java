package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Student;


@Repository
public class StudentRepoImpl implements StudentRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("Inside DAO:"+student.getStudentId());
		this.entityManager.persist(student);

	}

	@Override
	public void searchStudent(int id) {
		this.entityManager.find(Student.class, id);

	}

	@Override
	public void removeStudent(Student student) {
		this.entityManager.remove(student);

	}

	@Override
	public void updateStudent(Student student) {
		this.entityManager.merge(student);

	}

}
