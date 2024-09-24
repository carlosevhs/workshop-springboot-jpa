package com.devcarlosvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosvieira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
