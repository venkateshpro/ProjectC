package com.cakezone.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table

public class Cakes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cakeid;
	private String cakename;
	private String description;
	private int price;
	
	private String avthar;
	
	
	

	@OneToMany(mappedBy = "cake")
	private List<Orders> order;
	
	

	public Cakes() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cakes(int cakeid, String cakename, String description, int price, String avthar, List<Orders> order) {
		super();
		this.cakeid = cakeid;
		this.cakename = cakename;
		this.description = description;
		this.price = price;
		this.avthar = avthar;
		this.order = order;
	}


	public int getCakeid() {
		return cakeid;
	}



	public void setCakeid(int cakeid) {
		this.cakeid = cakeid;
	}



	public String getCakename() {
		return cakename;
	}



	public void setCakename(String cakename) {
		this.cakename = cakename;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getAvthar() {
		return avthar;
	}



	public void setAvthar(String avthar) {
		this.avthar = avthar;
	}



	public List<Orders> getOrder() {
		return order;
	}



	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	

	




}
