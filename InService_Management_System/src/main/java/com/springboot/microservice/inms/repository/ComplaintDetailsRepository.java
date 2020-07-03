package com.springboot.microservice.inms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.microservice.inms.model.ComplaintDetails;

public interface ComplaintDetailsRepository extends JpaRepository<ComplaintDetails, Integer>{

	public ComplaintDetails findComplaintDetailsByCust_Id(String Cust_Id);
	
	public List<ComplaintDetails> findAllComplaintDetails();
	
	//Integer deleteByCust_Id(String Cust_Id);
	
	@Modifying
	@Query("update Complaint_Details cs set cs.Room_No=:roomNo,cs.Request_Id=:reqId,cs.Category=:cat,cs.Subcategory=:subcat,"
			+ "cs.Description=:desc where cs.Cust_Id=:custid")
	int updateComplaintDetails(@Param("roomNo") int roomNo,@Param("reqId") Integer reqId,@Param("cat") String cat,@Param("subcat") String subcat,
			@Param("desc") String desc,@Param("custid") int custid);
}
