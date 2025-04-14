package com.springBoot.Course_reg_sys.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class CourseRegistry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  //no need to provide value for id auto generated
	private String name;
	private String email;
	private String courseName;
	
	
	public CourseRegistry() {}
	public CourseRegistry(String name, String email, String courseName) {
		this.name = name;
		this.email = email;
		this.courseName = courseName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "CourseRegister [name=" + name + ", email=" + email + ", CourseName=" + courseName + "]";
	}
	
}
