package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.student.model.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	public StudentService service;
	
	@GetMapping("/getStudents")
	public void getStudents(){
		List<Student> s =  service.getStudents();
		for(Student std:s){
			System.out.println(std.getRoolNo());
			System.out.println(std.getName());
		}
		
	}

}
