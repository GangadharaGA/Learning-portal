package com.gangadhara.learningportalnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gangadhara.learningportalnew.entity.CourseEntity;
import com.gangadhara.learningportalnew.entity.CourseEntity.Category;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
	//NativeQuery
	@Query(value="SELECT c FROM CourseEntity c WHERE c.category = :category",nativeQuery=true)
	List<CourseEntity> findByCategory(Category category);
}
