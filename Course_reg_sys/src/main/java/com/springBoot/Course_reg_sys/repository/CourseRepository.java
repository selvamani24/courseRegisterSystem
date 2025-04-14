package com.springBoot.Course_reg_sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Course_reg_sys.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{
	
}
