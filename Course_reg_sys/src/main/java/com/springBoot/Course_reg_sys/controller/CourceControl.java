package com.springBoot.Course_reg_sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Course_reg_sys.model.Course;
import com.springBoot.Course_reg_sys.model.CourseRegistry;
import com.springBoot.Course_reg_sys.service.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class CourceControl {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("courses")
	public List<Course> availableCourses() {
		return courseService.courseAvailable();
	}
	
	@PostMapping("courses/register")
	public String CourseRegister(@RequestParam("name") String name,
							@RequestParam("email") String emailId,
							@RequestParam("courseName") String courseName){
		courseService.courseRegister(name,emailId,courseName);
		return "Congratulation "+name+" Enrollment successfull for "+courseName;
	}
	@GetMapping("courses/enrolled")
	public List<CourseRegistry> getAllEnrollCourse() {
		return courseService.getEnrollCourse();
	}
	@PostMapping("courses/addCourse")
	public String addCourse(@RequestParam("courseId") String courseId,
							@RequestParam("courseName") String courseName,
							@RequestParam("trainer") String trainer,
							@RequestParam("durationInWeeks") Integer durationInWeeks) {
		courseService.addCourse(courseId,courseName,trainer,durationInWeeks);
		return "Congratulation "+courseName+" created successfully";
	}
	
	
}
