package com.devcarlosvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosvieira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
