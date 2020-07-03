package com.springboot.microservice.tms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Travel_Details")
public class TravelDetails {
	private String dealerName;
	private long dealerContactNo;
	
	private String dealerAddress;
	private String committedDate;
	private int dealerId;
	private String vehicleNo;
	private int vehicleRequestId;
	private String startDate;
	private String endDate;
	private String vehicleType;
	private int noOfCustomer;
	private String status;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getVehicleRequestId() {
		return vehicleRequestId;
	}
	public void setVehicleRequestId(int vehicleRequestId) {
		this.vehicleRequestId = vehicleRequestId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNoOfCustomer() {
		return noOfCustomer;
	}
	public void setNoOfCustomer(int noOfCustomer) {
		this.noOfCustomer = noOfCustomer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public String getCommittedDate() {
		return committedDate;
	}
	public void setCommittedDate(String committedDate) {
		this.committedDate = committedDate;
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public long getDealerContactNo() {
		return dealerContactNo;
	}
	public void setDealerContactNo(long dealerContactNo) {
		this.dealerContactNo = dealerContactNo;
	}
}
