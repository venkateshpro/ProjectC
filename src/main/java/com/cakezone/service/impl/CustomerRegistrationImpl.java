package com.cakezone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakezone.model.Users;
import com.cakezone.repository.CustomerRegisterRepository;
import com.cakezone.service.CustomerRegistration;
@Service
public class CustomerRegistrationImpl implements CustomerRegistration {

	@Autowired
	private CustomerRegisterRepository repository;
	
	@Override
	public Users saveCustomer(Users customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	

}
