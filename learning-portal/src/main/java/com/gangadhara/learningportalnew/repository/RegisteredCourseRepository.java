package com.gangadhara.learningportalnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gangadhara.learningportalnew.entity.RegisteredCourseEntity;

@Repository
public interface RegisteredCourseRepository extends JpaRepository<RegisteredCourseEntity, Long> {
	//NativeQuery
	@Query(value="SELECT rc FROM RegisteredCourseEntity rc WHERE rc.user.userId = :userId",nativeQuery=true)
	List<RegisteredCourseEntity> findByUserId(Long userId);
}
