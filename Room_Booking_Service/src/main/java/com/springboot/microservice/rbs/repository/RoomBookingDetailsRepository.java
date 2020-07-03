package com.springboot.microservice.rbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.rbs.model.RoomBookingDetails;

public interface RoomBookingDetailsRepository extends JpaRepository<RoomBookingDetails, Integer>{

}
