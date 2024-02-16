package com.gangadhara.learningportalnew.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gangadhara.learningportalnew.dto.CourseDTO;
import com.gangadhara.learningportalnew.entity.CourseEntity;
import com.gangadhara.learningportalnew.mapper.CourseMapper;
import com.gangadhara.learningportalnew.repository.CourseRepository;
import com.gangadhara.learningportalnew.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;

	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<CourseEntity> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public CourseDTO addCourse(CourseDTO course) {

		CourseEntity courseEntity = CourseMapper.populateCourse(course);
		CourseEntity resCourse = courseRepository.save(courseEntity);

		CourseDTO resCourseDTO = CourseMapper.courseEntityToDTO(resCourse);
		return resCourseDTO;
	}

	@Override
	public void deleteCourse(Long courseId) {
		courseRepository.deleteById(courseId);
	}

	@Override
	public CourseDTO updateCourse(CourseDTO course) {
		//checking if the course exists
		Optional<CourseEntity> existingCourse = courseRepository.findById(course.getCourseId());

		//if course exists
		if (existingCourse.isPresent()) {

			CourseEntity updatedCourse = CourseMapper.populateCourse(course);

			//saving the course
			CourseEntity changedCourse = courseRepository.save(updatedCourse);
			CourseDTO resCourseDTO = CourseMapper.courseEntityToDTO(changedCourse);

			return resCourseDTO;

		}
		//returning empty course
		return new CourseDTO();
	}

}
