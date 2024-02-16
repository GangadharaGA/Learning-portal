package com.gangadhara.learningportalnew.dto;

import com.gangadhara.learningportalnew.entity.RegisteredCourseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavouriteCourseDTO {
	private Long favouriteId;
	private RegisteredCourseEntity registeredCourse;

}
