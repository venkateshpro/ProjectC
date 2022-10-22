package com.cakezone.service;

import java.util.List;

import com.cakezone.model.Orders;

public interface OrderService {

	public List<Orders> getAllOrders();
	public void insertorder(int cakeid, int userid, String username, String cakename, int cakeprice);
	public List<Orders> getAllOrdersofuser(int userid);
}
