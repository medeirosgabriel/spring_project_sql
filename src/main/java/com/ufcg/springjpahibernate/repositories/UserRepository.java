package com.ufcg.springjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.springjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
