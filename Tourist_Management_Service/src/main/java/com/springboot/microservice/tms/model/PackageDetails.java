package com.springboot.microservice.tms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Package_Details")
public class PackageDetails {
private String customerID;
private String customerName;
private int packageID;
private String packageName;
private String packageType;
private String touristSpot;
private int pricePerHead;
private int noOfDays;
private int noofPassengers;
private String startDate;
private int customer_package_reqID;
private String status;
private double discount;
private double totalamount;
private int loyalty_points;
private String achieved_by;
private String achieved_date;
private String expiry_date;
private int totalLoyaltyPoints;
private String redeemLoyaltyStatus;
public String getRedeemLoyaltyStatus() {
	return redeemLoyaltyStatus;
}
public void setRedeemLoyaltyStatus(String redeemLoyaltyStatus) {
	this.redeemLoyaltyStatus = redeemLoyaltyStatus;
}
public int getTotalLoyaltyPoints() {
	return totalLoyaltyPoints;
}
public void setTotalLoyaltyPoints(int totalLoyaltyPoints) {
	this.totalLoyaltyPoints = totalLoyaltyPoints;
}
public int getLoyalty_points() {
	return loyalty_points;
}
public void setLoyalty_points(int loyaltyPoints) {
	loyalty_points = loyaltyPoints;
}
public String getAchieved_by() {
	return achieved_by;
}
public void setAchieved_by(String achievedBy) {
	achieved_by = achievedBy;
}
public String getAchieved_date() {
	return achieved_date;
}
public void setAchieved_date(String achievedDate) {
	achieved_date = achievedDate;
}
public String getExpiry_date() {
	return expiry_date;
}
public void setExpiry_date(String expiryDate) {
	expiry_date = expiryDate;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public double getTotalamount() {
	return totalamount;
}
public void setTotalamount(double totalamount) {
	this.totalamount = totalamount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getCustomer_package_reqID() {
	return customer_package_reqID;
}
public void setCustomer_package_reqID(int customerPackageReqID) {
	customer_package_reqID = customerPackageReqID;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public int getNoofPassengers() {
	return noofPassengers;
}
public void setNoofPassengers(int noofPassengers) {
	this.noofPassengers = noofPassengers;
}
private String foodandaccomidation;
public String getCustomerID() {
	return customerID;
}
public void setCustomerID(String customerID) {
	this.customerID = customerID;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}


public int getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
public String getFoodandaccomidation() {
	return foodandaccomidation;
}
public void setFoodandaccomidation(String foodandaccomidation) {
	this.foodandaccomidation = foodandaccomidation;
}
public int getPackageID() {
	return packageID;
}
public void setPackageID(int packageID) {
	this.packageID = packageID;
}
public String getPackageName() {
	return packageName;
}
public void setPackageName(String packageName) {
	this.packageName = packageName;
}
public String getPackageType() {
	return packageType;
}
public void setPackageType(String packageType) {
	this.packageType = packageType;
}
public String getTouristSpot() {
	return touristSpot;
}
public void setTouristSpot(String touristSpot) {
	this.touristSpot = touristSpot;
}
public int getPricePerHead() {
	return pricePerHead;
}
public void setPricePerHead(int pricePerHead) {
	this.pricePerHead = pricePerHead;
}

}

