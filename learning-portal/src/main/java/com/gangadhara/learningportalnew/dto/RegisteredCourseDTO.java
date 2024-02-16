package com.gangadhara.learningportalnew.dto;

import com.gangadhara.learningportalnew.entity.CourseEntity;
import com.gangadhara.learningportalnew.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisteredCourseDTO {

	private Long registrationId;
	private UserEntity user;
	private CourseEntity course;
}
