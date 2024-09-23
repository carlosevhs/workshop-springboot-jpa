package com.devcarlosvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosvieira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
