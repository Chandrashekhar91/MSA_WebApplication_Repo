package com.springboot.microservice.inms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HouseKeeping_Details")
public class HouseKeepingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ServiceID;
	private String ServiceName;
	private int Price;
	private String CustomerID;
	private int NoOfDays;
	private int Amount;
	private int requestId;
	private String CustomerName;
	
	public int getServiceID() {
		return ServiceID;
	}
	public void setServiceID(int serviceID) {
		ServiceID = serviceID;
	}
	public String getServiceName() {
		return ServiceName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public int getNoOfDays() {
		return NoOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	
}
