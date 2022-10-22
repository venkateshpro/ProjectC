package com.cakezone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cakezone.model.Users;
import com.cakezone.model.Admin;
import com.cakezone.model.Login;
import com.cakezone.repository.CustomerLoginRepository;
import com.cakezone.repository.AdminRepository;
@RestController
public class LoginController {
	
	int userid;
	String username;
	
	@Autowired
	CustomerLoginRepository customerrepository;
	
	@Autowired
	AdminRepository ropository;
	
	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Login.jsp");
		
		return mv;
		
	}
	
	@PostMapping("/login")
	public ModelAndView loginCustomer(@ModelAttribute Login login) throws Exception {
		
		
		String email = login.getEmail();
		String password = login.getPassword();
		String role=login.getRole();
		
		Users cus=customerrepository.findByEmailAndPassword(email,password);
		Admin admin=ropository.findByEmailAndPassword(email,password);
		
		switch(role) {
		case "user":
			if(cus!=null) {
				ModelAndView mv= new ModelAndView();
				userid=cus.getUserid();
				username=cus.getUsername();
				mv.addObject("email", email);
				mv.setViewName("index.jsp");
				return mv;
				
			}
			else {
				ModelAndView mv= new ModelAndView();
				mv.setViewName("wrongcredentails.jsp");
				return mv;
				
			}
			
		case "admin":
			
			if(admin!=null) {
				System.out.println("iam in employee page");
				ModelAndView mv= new ModelAndView();
				mv.setViewName("Admin.jsp");
				return mv;
				
			}
			else {
				ModelAndView mv= new ModelAndView();
				mv.setViewName("wrongcredentails.jsp");
				return mv;
			}
			
		
		}
		return null;
		
		
	}

}
