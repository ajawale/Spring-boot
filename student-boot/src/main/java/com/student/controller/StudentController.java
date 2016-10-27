package com.student.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.model.Student;
import com.student.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	public StudentService service;
	
	@GetMapping("/getStudents")
	@ResponseBody
	public String getStudents(){
		String name="";
	  List<Student> s = (List) service.getStudents();
			  System.out.println(s);
	  for(Student std:s){
		  name = std.getName();
		  System.out.println(name);
	  }
	  
	return name;
		
		
	}

}
