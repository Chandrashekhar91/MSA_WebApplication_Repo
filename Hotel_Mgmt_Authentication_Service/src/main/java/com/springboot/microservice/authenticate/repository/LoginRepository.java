package com.springboot.microservice.authenticate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.authenticate.model.LoginDetails;

public interface LoginRepository extends JpaRepository<LoginDetails, Integer> {
	LoginDetails findLoginDetailsByUserId(String userId);
}
