package com.springboot.microservice.tms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Vehicle_Details")
public class VehicleDetails {
	private String vehiclenumber;

	private String vehicletype;
	private int numberof_customers;

	private String vehiclestatus;

	public Date1 dobj;
	private int dealerid;

	private String createdby;
	private String createddate;
	private String updatedby;
	private String updateddate;

	private String vehicledate;
	private String vehicledetails;

	public String getVehicledetails() {
		return vehicledetails;
	}

	public void setVehicledetails(String vehicledetails) {
		this.vehicledetails = vehicledetails;
	}

	public String getVehicledate() {
		return vehicledate;
	}

	public void setVehicledate(String vehicledate) {
		this.vehicledate = vehicledate;
	}

	public Date1 getDobj() {
		return dobj;
	}

	public void setDobj(Date1 dobj) {
		this.dobj = dobj;
	}

	public int getDealerid() {
		return dealerid;
	}

	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public String getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}

	public String getVehiclenumber() {
		return vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public int getNumberof_customers() {
		return numberof_customers;
	}

	public void setNumberof_customers(int numberofCustomers) {
		numberof_customers = numberofCustomers;
	}

	public String getVehiclestatus() {
		return vehiclestatus;
	}

	public void setVehiclestatus(String vehiclestatus) {
		this.vehiclestatus = vehiclestatus;
	}

}
