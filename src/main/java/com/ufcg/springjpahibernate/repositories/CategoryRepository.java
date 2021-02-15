package com.ufcg.springjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.springjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
