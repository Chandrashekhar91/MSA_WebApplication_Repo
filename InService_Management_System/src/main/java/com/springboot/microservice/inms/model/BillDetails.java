package com.springboot.microservice.inms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bill_Details")
public class BillDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String CustomerID;
	private String CustomerName;
	private int RequestID;
	private int Days;
	private String RoomType;
	private String AC;
	private int RoomCharge;
	private int NoOfRooms;
	private int LodgingCharge;
	private int ServicesCharge;
	private int AdvancePayment;
	private String Mode;
	private int Advance;
	private int Loyalty;
	private int BillNo;
	private String Status;
	private String Bill_date;

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}

	public int getDays() {
		return Days;
	}

	public void setDays(int days) {
		Days = days;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	public String getAC() {
		return AC;
	}

	public void setAC(String aC) {
		AC = aC;
	}

	public int getRoomCharge() {
		return RoomCharge;
	}

	public void setRoomCharge(int roomCharge) {
		RoomCharge = roomCharge;
	}

	public int getNoOfRooms() {
		return NoOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		NoOfRooms = noOfRooms;
	}

	public int getLodgingCharge() {
		return LodgingCharge;
	}

	public void setLodgingCharge(int lodgingCharge) {
		LodgingCharge = lodgingCharge;
	}

	public int getServicesCharge() {
		return ServicesCharge;
	}

	public void setServicesCharge(int servicesCharge) {
		ServicesCharge = servicesCharge;
	}

	public int getAdvancePayment() {
		return AdvancePayment;
	}

	public void setAdvancePayment(int advancePayment) {
		AdvancePayment = advancePayment;
	}

	public String getMode() {
		return Mode;
	}

	public void setMode(String mode) {
		Mode = mode;
	}

	public int getAdvance() {
		return Advance;
	}

	public void setAdvance(int advance) {
		Advance = advance;
	}

	public int getLoyalty() {
		return Loyalty;
	}

	public void setLoyalty(int loyalty) {
		Loyalty = loyalty;
	}

	public int getBillNo() {
		return BillNo;
	}

	public void setBillNo(int billNo) {
		BillNo = billNo;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getBill_date() {
		return Bill_date;
	}

	public void setBill_date(String bill_date) {
		Bill_date = bill_date;
	}

}