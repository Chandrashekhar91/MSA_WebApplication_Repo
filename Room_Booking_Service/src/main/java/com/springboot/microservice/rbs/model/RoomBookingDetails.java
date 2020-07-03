package com.springboot.microservice.rbs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Room_Booking_Details")
public class RoomBookingDetails {
	private String customerId;
	private String customerName;
	private String employeeId;
	private int age;
	private String location;
	private String gender;
	private String emailId;
	private long contactNo;
	private String password;
	private String emppassword;
	private String secretQuestion;
	private String secretAnswer;
	private int requestId;
	private Date checkInDate;
	private Date checkOutDate;
	private int roomNumber;
	private int roomsRequired;
	private int floorNo;
	private Date endDate;
	private String roomPreference;
	private String floorPreference;
	private String roomRequestStatus;
	private String remarks;
	private String allotmentStatus;
	private int allotmentId;
	private int advancePayment;
	private Date paymentDate;
	private String bankName;
	private String bankIfscCode;
	private String branchLocation;
	private int accountNumber;
	private String accountType;
	private String accountHolder;
	private String designation;
	private int PaymentId;
	private int advanceAmount;
	private int refundAmount;
	private Date refundDate;
	private String refundStatus;
	private String roomType;
	private String roomCategory;
	private String acNonAc;
	private int roomRent;
	private String roomStatus;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getSecretQuestion() {
		return secretQuestion;
	}
	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}
	public String getSecretAnswer() {
		return secretAnswer;
	}
	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getRoomsRequired() {
		return roomsRequired;
	}
	public void setRoomsRequired(int roomsRequired) {
		this.roomsRequired = roomsRequired;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getRoomPreference() {
		return roomPreference;
	}
	public void setRoomPreference(String roomPreference) {
		this.roomPreference = roomPreference;
	}
	public String getFloorPreference() {
		return floorPreference;
	}
	public void setFloorPreference(String floorPreference) {
		this.floorPreference = floorPreference;
	}
	public String getRoomRequestStatus() {
		return roomRequestStatus;
	}
	public void setRoomRequestStatus(String roomRequestStatus) {
		this.roomRequestStatus = roomRequestStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAllotmentStatus() {
		return allotmentStatus;
	}
	public void setAllotmentStatus(String allotmentStatus) {
		this.allotmentStatus = allotmentStatus;
	}
	public int getAllotmentId() {
		return allotmentId;
	}
	public void setAllotmentId(int allotmentId) {
		this.allotmentId = allotmentId;
	}
	public int getAdvancePayment() {
		return advancePayment;
	}
	public void setAdvancePayment(int advancePayment) {
		this.advancePayment = advancePayment;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankIfscCode() {
		return bankIfscCode;
	}
	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}
	public int getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(int advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public int getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(int refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Date getRefundDate() {
		return refundDate;
	}
	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomCategory() {
		return roomCategory;
	}
	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}
	public String getAcNonAc() {
		return acNonAc;
	}
	public void setAcNonAc(String acNonAc) {
		this.acNonAc = acNonAc;
	}
	public int getRoomRent() {
		return roomRent;
	}
	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
}