package com.ufcg.springjpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ufcg.springjpahibernate.entities.Category;
import com.ufcg.springjpahibernate.repositories.CategoryRepository;

@Component
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> opt = categoryRepository.findById(id);
		return opt.get();
	}
}
