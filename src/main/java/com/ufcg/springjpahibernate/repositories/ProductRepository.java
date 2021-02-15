package com.ufcg.springjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.springjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
