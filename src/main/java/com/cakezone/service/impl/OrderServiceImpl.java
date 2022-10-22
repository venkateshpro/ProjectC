package com.cakezone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakezone.model.Orders;
import com.cakezone.repository.OrderRepository;
import com.cakezone.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Orders> getAllOrders() {
		return repository.findAll();
	}


	public void insertorder(int cakeid, int userid, String username, String cakename, int price) {
		 repository.insertOrder(userid,cakeid,username,cakename,price);
	}

	public List<Orders> getAllOrdersofuser(int userid) {
		
		return 	repository.findByUserUserId( userid);
		
	}

}
