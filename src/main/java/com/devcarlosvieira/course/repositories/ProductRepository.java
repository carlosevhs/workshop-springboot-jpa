package com.devcarlosvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosvieira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
