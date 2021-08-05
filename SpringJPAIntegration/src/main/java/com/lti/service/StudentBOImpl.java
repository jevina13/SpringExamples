package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.StudentRepository;
import com.lti.model.Student;

@Service		//class can be injected to other classes managed by  Spring Container
@Transactional  //Denotes all methods iin this class to perform JPA transaction managed by Spr Cont
public class StudentBOImpl implements StudentBO {

	@Autowired  //Dependency Injection
	StudentRepository studDao;
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("Inside BO");
		studDao.saveStudent(student);
	}

	@Override
	public void searchStudent(int id) {
		studDao.searchStudent(id);
	}

	@Override
	public void removeStudent(Student student) {
		studDao.removeStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studDao.updateStudent(student);
	}

}
