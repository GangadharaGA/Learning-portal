package com.gangadhara.learningportalnew.service;

import java.util.List;

import com.gangadhara.learningportalnew.dto.CourseDTO;
import com.gangadhara.learningportalnew.entity.CourseEntity;

public interface CourseService {

	//AUTHOR
	//get all courses
	List<CourseEntity> getAllCourses();

	//add courses
	CourseDTO addCourse(CourseDTO course);

	//delete courses
	void deleteCourse(Long courseId);

	//update course
	CourseDTO updateCourse(CourseDTO course);

}
