package com.cg.jpacrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.dao.StudentDaoImpl;
import com.cg.jpacrud.entities.Student;
@Service("student_service")
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	private StudentDao dao;


	@Override
	public void addStudent(Student student) {
		
		dao.addStudent(student);
		
	}
	
	@Override
	public void updateStudent(Student student) {
		
		dao.updateStudent(student);
		
	}
	
	@Override
	public void removeStudent(Student student) {
		//dao.beginTransaction();
		dao.removeStudent(student);
		//dao.commitTransaction();
	}
	
	@Override
	public Student findStudentById(int id) {
		//no need of transaction, as it's an read operation
		Student student  = dao.getStudentById(id);
		return student;
	}
}
