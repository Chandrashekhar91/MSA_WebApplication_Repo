package com.springboot.microservice.inms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.inms.model.HouseKeepingDetails;

public interface HouseKeepingDetailsRepository extends JpaRepository<HouseKeepingDetails, Integer>{

}
