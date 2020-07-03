package com.springboot.microservice.inms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.inms.model.LoginDetails;

public interface LoginDetailsRepository extends JpaRepository<LoginDetails, Long> {

}
