package com.ufcg.springjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.springjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
