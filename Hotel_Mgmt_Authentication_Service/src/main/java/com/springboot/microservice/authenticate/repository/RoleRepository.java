package com.springboot.microservice.authenticate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.authenticate.model.RoleDetails;

public interface RoleRepository extends JpaRepository<RoleDetails, Integer> {
	RoleDetails findRoleDetailsByRoleId(String roleId);

}
