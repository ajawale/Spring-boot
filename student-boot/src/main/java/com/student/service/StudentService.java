package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository repository;
	
	@Transactional
	public List<Student> getStudents(){
		return (List<Student>) repository.findAll();
		
	}
}
