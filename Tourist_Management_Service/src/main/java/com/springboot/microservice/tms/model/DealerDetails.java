package com.springboot.microservice.tms.model;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Dealer_Details")
public class DealerDetails {
private int dealerid;
private String dealername;
private int dealercontactnumber;
private String dealeraddress;
private Date commiteddate;
public ArrayList<VehicleDetails> vobj;

public ArrayList<VehicleDetails> getVobj() {
	return vobj;
}
public void setVobj(ArrayList<VehicleDetails> vobj) {
	this.vobj = vobj;
}
public int getDealerid() {
	return dealerid;
}
public void setDealerid(int dealerid) {
	this.dealerid = dealerid;
}
public String getDealername() {
	return dealername;
}
public void setDealername(String dealername) {
	this.dealername = dealername;
}
public int getDealercontactnumber() {
	return dealercontactnumber;
}
public void setDealercontactnumber(int dealercontactnumber) {
	this.dealercontactnumber = dealercontactnumber;
}
public String getDealeraddress() {
	return dealeraddress;
}
public void setDealeraddress(String dealeraddress) {
	this.dealeraddress = dealeraddress;
}
public Date getCommiteddate() {
	return commiteddate;
}
public void setCommiteddate(Date commiteddate) {
	this.commiteddate = commiteddate;
}



}
