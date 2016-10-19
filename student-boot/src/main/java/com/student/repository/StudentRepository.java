package com.student.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.model.Student;


@Repository
public class StudentRepository {
	  
	@Autowired
	    EntityManager manager;

	   public List<Student> findAll() {
	        List<Student> student = manager.createQuery("from STUDENT", Student.class)
	                .getResultList();
	        return student;
	    }
		
	}

