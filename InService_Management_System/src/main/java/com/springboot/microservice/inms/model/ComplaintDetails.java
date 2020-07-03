package com.springboot.microservice.inms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Complaint_Details")
public class ComplaintDetails {

	private String Cust_Id;
	private int Room_No;
	private int Request_Id;
	private String Category;
	private String Subcategory;
	private String Description;

	public String getCust_Id() {
		return Cust_Id;
	}

	public void setCust_Id(String cust_Id) {
		Cust_Id = cust_Id;
	}

	public int getRoom_No() {
		return Room_No;
	}

	public void setRoom_No(int room_No) {
		Room_No = room_No;
	}

	public int getRequest_Id() {
		return Request_Id;
	}

	public void setRequest_Id(int request_Id) {
		Request_Id = request_Id;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getSubcategory() {
		return Subcategory;
	}

	public void setSubcategory(String subcategory) {
		Subcategory = subcategory;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}

