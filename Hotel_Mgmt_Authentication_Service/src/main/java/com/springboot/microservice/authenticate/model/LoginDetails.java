package com.springboot.microservice.authenticate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Login_Details")
public class LoginDetails {
	private String userId;
	private String password;
	private String userName;
	private String email_address;
	private String contactNo;
	
	@OneToOne(fetch=FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name="roleId", nullable=false)
	private RoleDetails roleId;
	
	public RoleDetails getRoleId() {
		return roleId;
	}
	public void setRoleId(RoleDetails roleId) {
		this.roleId = roleId;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
}
