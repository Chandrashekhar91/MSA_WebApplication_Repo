package com.springboot.microservice.tms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Tour_Package_Details")
public class TourPackageDetails {
	private int package_Id;
	private String packagename;
	private String packagetype;
	private String tourist_spot;
	private int price_per_head;
	private int packageprice;
	private boolean tourisr_packagestatus;
	private int Noofdays;
	public int getPackageprice() {
		return packageprice;
	}
	public void setPackageprice(int packageprice) {
		this.packageprice = packageprice;
	}

public int getPackage_Id() {
	return package_Id;
}
public void setPackage_Id(int packageId) {
	package_Id = packageId;
}
public String getPackagename() {
	return packagename;
}
public void setPackagename(String packagename) {
	this.packagename = packagename;
}
public String getPackagetype() {
	return packagetype;
}
public void setPackagetype(String packagetype) {
	this.packagetype = packagetype;
}
public String getTourist_spot() {
	return tourist_spot;
}
public void setTourist_spot(String touristSpot) {
	tourist_spot = touristSpot;
}
public int getPrice_per_head() {
	return price_per_head;
}
public void setPrice_per_head(int pricePerHead) {
	price_per_head = pricePerHead;
}
public boolean isTourisr_packagestatus() {
	return tourisr_packagestatus;
}
public void setTourisr_packagestatus(boolean tourisrPackagestatus) {
	tourisr_packagestatus = tourisrPackagestatus;
}
public int getNoofdays() {
	return Noofdays;
}
public void setNoofdays(int noofdays) {
	Noofdays = noofdays;
}

}
