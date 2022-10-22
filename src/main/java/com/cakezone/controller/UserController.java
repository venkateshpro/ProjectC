package com.cakezone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cakezone.model.Users;
import com.cakezone.service.CustomerService;

import io.swagger.annotations.Api;

@Api(description = "Operaions for customer list")
@CrossOrigin
@RestController
public class UserController {
	
	int userid;
	@Autowired
	private CustomerService cusservice;
	@GetMapping("/newuser")
	public ModelAndView newuser() {
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("userRegistration.jsp");
		
		return mv ;
		
	}
	@PostMapping("/adduser")
	public String addCustomer(@ModelAttribute Users customer) {
		System.out.println(cusservice.addCustomer(customer));
		cusservice.addCustomer(customer);
		return "add successfully";
	}

	@DeleteMapping("/deletecustomer")
	public void deleteCustomer(@PathVariable int id) {
		cusservice.deleteCustomer(id);
	}

	@GetMapping("/userlist")
	public ModelAndView getAllCustomers() {
		List<Users> listc= new ArrayList<>();
		ModelAndView mv= new ModelAndView();
		
		listc.addAll(cusservice.getAllCustomers());
		mv.addObject("listusers", listc);
		mv.setViewName("userlist.jsp");
		return mv;
	}
	@RequestMapping("/userid")
	public ModelAndView useridforupdate(@RequestParam(value="userid") int userId) {
		userid=userId;
		System.out.println(userid);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("updatecustomer.jsp");
		return mv;
		
		
	}
	@RequestMapping("//deleteuserbyid")
	public ModelAndView useridfordelete(@RequestParam(value="id") int id) {
	
		cusservice.deleteCustomer(id);

		System.out.println(userid);
		List<Users> listc= new ArrayList<>();
		ModelAndView mv= new ModelAndView();
		listc.addAll(cusservice.getAllCustomers());
		mv.addObject("listusers", listc);
		mv.setViewName("userlist.jsp");
		return mv;
		
		
	}
	
	@PostMapping("/updatecustomer")
	public ModelAndView updatecustomer(@RequestParam (value="username") String username,
			@RequestParam (value="email") String useremail,
			@RequestParam (value="password") String password
			){
		
		cusservice.updateuser(username,useremail,password,userid);
		List<Users> listc= new ArrayList<>();
		ModelAndView mv= new ModelAndView();
		
		listc.addAll(cusservice.getAllCustomers());
		mv.addObject("listusers", listc);
		System.out.println(userid);
		
		mv.setViewName("userlist.jsp");
		return mv;
		
	}
	

}
