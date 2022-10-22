package com.cakezone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table

public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@ManyToOne
	@JoinColumn(name = "userid")
	private Users user;

	@ManyToOne
	@JoinColumn(name = "cakeid")
	private Cakes cake;
	
	String username;
	String cakename;
	int price;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Orders(int orderId, Users user, Cakes cake, String username, String cakename, int price) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.cake = cake;
		this.username = username;
		this.cakename = cakename;
		this.price = price;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Cakes getCake() {
		return cake;
	}

	public void setCake(Cakes cake) {
		this.cake = cake;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCakename() {
		return cakename;
	}

	public void setCakename(String cakename) {
		this.cakename = cakename;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	

	
}
