package com.devcarlosvieira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlosvieira.course.entities.OrderItem;
import com.devcarlosvieira.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
	