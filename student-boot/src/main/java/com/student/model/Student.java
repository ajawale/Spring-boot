package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
    @Column(name = "rollno")
	private int rool_no;
	
	@Column(name = "name") 
	private String name;

	
	public int getRoolNo() {
		return rool_no;
	}
	

	public Student() {
		
	}


	public Student(int roolNo, String name) {
		super();
		this.rool_no = roolNo;
		this.name = name;
	}

	public void setRoolNo(int roolNo) {
		this.rool_no = roolNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
