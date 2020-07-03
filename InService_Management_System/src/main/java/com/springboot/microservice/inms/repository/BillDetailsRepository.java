package com.springboot.microservice.inms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.microservice.inms.model.BillDetails;

public interface BillDetailsRepository extends JpaRepository<BillDetails, Integer> {

}
