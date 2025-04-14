package com.springBoot.Course_reg_sys.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Course {
	
	@Id
	private String courseId;
	private String courseName;
	private String trainer;
	private int durationInWeeks;
	
	//default constructor
	public Course() {}
	//argument constructor
	public Course(String courseId, String courseName, String trainer, Integer durationInWeeks) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.trainer = trainer;
		this.durationInWeeks = durationInWeeks;
	}
	
	//getter & setter
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public int getDurationInWeeks() {
		return durationInWeeks;
	}
	public void setDurationInWeeks(Integer durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainer=" + trainer
				+ ", durationInWeeks=" + durationInWeeks + "]";
	}
}
