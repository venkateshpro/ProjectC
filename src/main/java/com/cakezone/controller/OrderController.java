package com.cakezone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cakezone.model.Orders;
import com.cakezone.service.impl.OrderServiceImpl;

@CrossOrigin
@RestController
public class OrderController  {

	
	
	@Autowired
	OrderServiceImpl orederservice;
	
	@Autowired
	private LoginController longicontroller;

	@PostMapping("/ordercake")
	public ModelAndView addOrder(@RequestParam(value = "cakeid", required = false) int cakeid,
			@RequestParam(value = "price", required = false) int price,
			@RequestParam(value = "cakename", required = false) String cakename
			) {
	
		int userid=longicontroller.userid;
		String username=longicontroller.username;
		System.out.println(price);
		System.out.println(cakename);

		System.out.println(cakeid);

		
		orederservice.insertorder(cakeid,userid,username,cakename,price);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("success.jsp");
		return mv;
	}
	@GetMapping("/orderslist")
	public ModelAndView getAllOrders() {
		List<Orders> listorders= new ArrayList<>();

		ModelAndView mv= new ModelAndView();
		listorders.addAll(orederservice.getAllOrders());

		mv.addObject("orderlist", listorders);
		mv.setViewName("orderlist.jsp");
		return mv;
	}
	@GetMapping("/orderslistofcustomer")
	public ModelAndView getAllOrdersofcustomer() {
		List<Orders> listorders= new ArrayList<>();

		ModelAndView mv= new ModelAndView();
		listorders.addAll(orederservice.getAllOrdersofuser(longicontroller.userid));

		mv.addObject("orderlist", listorders);
		mv.setViewName("orderlistforsingleCustomer.jsp");
		return mv;
	
	}
}
