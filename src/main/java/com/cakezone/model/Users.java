package com.cakezone.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity

public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int userid;
	
	private String username;
	private String email;
	private String password;
	

	
	@OneToMany(mappedBy = "user")
	private List<Orders> order;



	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(int userid, String username, String email, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Orders> getOrder() {
		return order;
	}


	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	



}
