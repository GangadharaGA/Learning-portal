package com.gangadhara.learningportalnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gangadhara.learningportalnew.entity.FavouriteCourseEntity;

@Repository
public interface FavouriteCourseRepository extends JpaRepository<FavouriteCourseEntity, Long> {
	//NativeQuery
	@Query(value="SELECT f FROM FavouriteCourseEntity f WHERE f.registeredCourse.registrationId = :registrationId",nativeQuery=true)
	List<FavouriteCourseEntity> findByRegistrationId(Long registrationId);
}
