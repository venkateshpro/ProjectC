package com.cakezone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cakezone.model.Cakes;
import com.cakezone.repository.CakeRepository;
import com.cakezone.service.cakeService;


@RestController
public class CakeController {

	int cake_id;
	@Autowired
	private CakeRepository repository;
	
	@Autowired
	private cakeService cakeservice;

	@GetMapping("/newcake")
	public ModelAndView newuser() {
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("addcake.jsp");
		
		return mv ;
		
	}
	
	@PostMapping("/addcake")
	public String addCake(@ModelAttribute Cakes food) {
		cakeservice.addcake(food);
		return " Cake added successfully";
	}

	

	@GetMapping("/cakesfororder")
	public ModelAndView getcakelistforuser() {
		List <Cakes> cakes= new ArrayList<>(); 
		
		cakes.addAll(cakeservice.getAllCakes());
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("clist", cakes);
		mv.setViewName("cakelistfororder.jsp");
		return mv;
		
		
	}
	@GetMapping("/cakeslist")
	public ModelAndView getAllcakes() {
		List <Cakes> cakes= new ArrayList<>(); 
		
		cakes.addAll(cakeservice.getAllCakes());
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("listcake", cakes);
		mv.setViewName("cakelist.jsp");
		return mv;
		
		
	}


	@RequestMapping("/cakeid")
	public ModelAndView getcakeid(@RequestParam (value = "cakeid") int cakeid) {
		
		System.out.println(cakeid);
		cake_id = cakeid;
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("updatecake.jsp");
		return mv;
		
	}

	
	@PostMapping("/updatecake")
	public ModelAndView updatecake(@RequestParam (value="cakename") String cakename,
			@RequestParam (value="price") int price,
			@RequestParam (value="avthar") String avthar,
			@RequestParam (value="description") String description) {
		cakeservice.updateCake(cakename,price,avthar,description,cake_id);
		ModelAndView mv=new ModelAndView();

		List<Cakes> cakelist= new ArrayList<>();
		cakelist.addAll(cakeservice.getAllCakes());
		mv.addObject("listcake", cakelist);
		mv.setViewName("cakelist.jsp");
		return mv;
		
		
	}
	@RequestMapping("/deletecakes")
	public ModelAndView deletecake(@RequestParam (value = "id") int id) {
		

		System.out.println(id);
		repository.deleteById(id);
		List <Cakes> cakes= new ArrayList<>(); 
		 cakes.addAll(cakeservice.getAllCakes());
			
			ModelAndView mv= new ModelAndView();
			mv.addObject("listcake", cakes);
			mv.setViewName("cakelist.jsp");		
		return mv;
		
	}
	

}
