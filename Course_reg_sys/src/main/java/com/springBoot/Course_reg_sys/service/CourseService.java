package com.springBoot.Course_reg_sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Course_reg_sys.model.Course;
import com.springBoot.Course_reg_sys.model.CourseRegistry;
import com.springBoot.Course_reg_sys.repository.CourseEnrolRepo;
import com.springBoot.Course_reg_sys.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepo;
	@Autowired
	CourseEnrolRepo courseEnrolRepo;
	@Autowired
	CourseRegistry courseRegistry;
	@Autowired
	Course course;
	
	public List<Course> courseAvailable() {
		return courseRepo.findAll();
	}
	public void courseRegister(String name,String emailId,String courseName) {
		courseRegistry = new CourseRegistry(name,emailId,courseName);
		courseEnrolRepo.save(courseRegistry);
	}
	public List<CourseRegistry> getEnrollCourse() {
		return courseEnrolRepo.findAll();
	}
	public void addCourse(String courseId,String courseName, String trainer, Integer durationInWeeks) 
	{
		course = new Course(courseId,courseName,trainer,durationInWeeks);
		courseRepo.save(course);
	}
	
	
}
