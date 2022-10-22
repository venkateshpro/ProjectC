package com.cakezone.service;

import java.util.List;

import com.cakezone.model.Users;

public interface CustomerService {

		Users addCustomer(Users customer);
		void deleteCustomer(int id);
		List<Users> getAllCustomers();
		Users getCustomerById(int id);
		void updateuser(String username, String useremail, String password, int userid);
		
	
}
