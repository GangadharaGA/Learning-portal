package com.gangadhara.learningportalnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gangadhara.learningportalnew.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
