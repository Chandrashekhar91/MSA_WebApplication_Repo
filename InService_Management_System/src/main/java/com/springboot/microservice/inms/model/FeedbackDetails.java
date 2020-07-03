package com.springboot.microservice.inms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Feedback_Details")
public class FeedbackDetails {
	
	private String Cust_Id;
	private int Room_No;
	private int Request_Id;
	private String Likes;
	private String Dislikes;
	private int Rating;
	private String Comments;
	private String Improvements;
	String Name;
	
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
	public String getLikes() {
		return Likes;
	}
	public void setLikes(String likes) {
		Likes = likes;
	}
	public String getDislikes() {
		return Dislikes;
	}
	public void setDislikes(String dislikes) {
		Dislikes = dislikes;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getImprovements() {
		return Improvements;
	}
	public void setImprovements(String improvements) {
		Improvements = improvements;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}


