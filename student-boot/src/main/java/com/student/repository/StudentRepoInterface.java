package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Student;



@Repository	
public interface StudentRepoInterface extends CrudRepository<Student, Long> {
	@Query("select roll_no from STUDENT")
	List<Student> findAll();
}
