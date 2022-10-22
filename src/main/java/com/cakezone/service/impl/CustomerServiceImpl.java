package com.cakezone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakezone.model.Users;
import com.cakezone.repository.CustomerRepository;
import com.cakezone.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Users addCustomer(Users customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);;
	}

	@Override
	public List<Users> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Users getCustomerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void updateuser(String username,  String useremail, String password,int userid) {
		repository.updateuser(username,useremail,password,userid);
		
	}

}
