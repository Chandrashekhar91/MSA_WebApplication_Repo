package com.springboot.microservice.tms.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Customer_Details")
public class CustomerDetails {
	private String customerId;
	private String customername;
	private Date checkindate;
	private Date checkoutdate;
	private int customer_age;
	private String customer_gender;
	private String customer_location;
	private String customer_emailid;
	private long customer_contactnumber;
	private String customer_password;
	private String groundfloorprefernce;
	private String customer_DOB;
	private String customer_address;
	private String customer_roomcategory;
	private String customer_roomtype;
	private int customer_floorNumber;
	private String dateoftravel;
	private boolean room_requeststatus;
	private String request_status;
	public String getRequest_status() {
		return request_status;
	}
	public void setRequest_status(String requestStatus) {
		request_status = requestStatus;
	}
	TourPackageDetails pack=new TourPackageDetails();
	private int customer_package_id;
	
	
	public int getCustomer_package_id() {
		return customer_package_id;
	}
	public void setCustomer_package_id(int customerPackageId) {
		customer_package_id = customerPackageId;
	}
	private int noofpersons;




	public int getNoofpersons() {
		return noofpersons;
	}
	public void setNoofpersons(int noofpersons) {
		this.noofpersons = noofpersons;
	}
	public TourPackageDetails getPack() {
		return pack;
	}
	public void setPack(TourPackageDetails pack) {
		this.pack = pack;
	}
	public String getDateoftravel() {
		return dateoftravel;
	}
	public void setDateoftravel(String dateoftravel) {
		this.dateoftravel = dateoftravel;
	}
	public boolean isRoom_requeststatus() {
		return room_requeststatus;
	}
	public void setRoom_requeststatus(boolean roomRequeststatus) {
		room_requeststatus = roomRequeststatus;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Date  getCheckindate() {
		return checkindate;
	}
	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}
	public Date  getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public int getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(int customerAge) {
		customer_age = customerAge;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customerGender) {
		customer_gender = customerGender;
	}
	public String getCustomer_location() {
		return customer_location;
	}
	public void setCustomer_location(String customerLocation) {
		customer_location = customerLocation;
	}
	public String getCustomer_emailid() {
		return customer_emailid;
	}
	public void setCustomer_emailid(String customerEmailid) {
		customer_emailid = customerEmailid;
	}
	public long getCustomer_contactnumber() {
		return customer_contactnumber;
	}
	public void setCustomer_contactnumber(long customerContactnumber) {
		customer_contactnumber = customerContactnumber;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customerPassword) {
		customer_password = customerPassword;
	}
	public String getGroundfloorprefernce() {
		return groundfloorprefernce;
	}
	public void setGroundfloorprefernce(String groundfloorprefernce) {
		this.groundfloorprefernce = groundfloorprefernce;
	}
	public String getCustomer_DOB() {
		return customer_DOB;
	}
	public void setCustomer_DOB(String customerDOB) {
		customer_DOB = customerDOB;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customerAddress) {
		customer_address = customerAddress;
	}
	public String getCustomer_roomcategory() {
		return customer_roomcategory;
	}
	public void setCustomer_roomcategory(String customerRoomcategory) {
		customer_roomcategory = customerRoomcategory;
	}
	public String getCustomer_roomtype() {
		return customer_roomtype;
	}
	public void setCustomer_roomtype(String customerRoomtype) {
		customer_roomtype = customerRoomtype;
	}
	public int getCustomer_floorNumber() {
		return customer_floorNumber;
	}
	public void setCustomer_floorNumber(int customerFloorNumber) {
		customer_floorNumber = customerFloorNumber;
	}


}
