package com.ufcg.springjpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ufcg.springjpahibernate.entities.Order;
import com.ufcg.springjpahibernate.repositories.OrderRepository;

@Component
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> opt = orderRepository.findById(id);
		return opt.get();
	}
}
