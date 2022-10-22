package com.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cakezone.model.Users;
import com.cakezone.FooderzAppApplication;
import com.cakezone.model.Orders;
import com.cakezone.repository.CustomerRepository;
import com.cakezone.service.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FooderzAppApplication.class)
class CustomerControllerTest {
	@Autowired
	private CustomerService service;

	@MockBean
	private CustomerRepository repository;
	
	@Autowired
	Orders oders;
	
	

	@Test
	void testAddCustomer() {

		Users customer = new Users(1, "Kesa", "kg42@gmail.com", "qwertyuiop");
		when(repository.save(customer)).thenReturn(customer);
		assertEquals(customer, service.addCustomer(customer));
	}

	@Test
	void testDeleteCustomer() {
		Users customer = new Users();
		customer.setUserid(1);;
		service.deleteCustomer(customer.getUserid());
		verify(repository, times(1)).deleteById(customer.getUserid());
	}

	@Test
	void testGetAllCustomers() {
		when(repository.findAll()).thenReturn(Stream
				.of(new Users(1, "Satish",  "satish112@gmail.com", "qwertyuiop"),
						new Users(2, "Vinay",  "vs234@gmail.com", "123456789"))
				.collect(Collectors.toList()));
		assertEquals(2, service.getAllCustomers().size());
	}
	

}
