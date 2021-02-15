package com.ufcg.springjpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ufcg.springjpahibernate.entities.Product;
import com.ufcg.springjpahibernate.repositories.ProductRepository;

@Component
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> opt = productRepository.findById(id);
		return opt.get();
	}
}
