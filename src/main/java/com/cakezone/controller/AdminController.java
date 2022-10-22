package com.cakezone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cakezone.model.Admin;
import com.cakezone.service.AdminService;

import io.swagger.annotations.Api;

@Api(description = "CRUD operations for Employee in the Fooderz app")
@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminService service;

	@PostMapping("/addadmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return service.addAdmin(admin);
	}

	@GetMapping("/employees")
	public List<Admin> getAllAdmins() {
		return service.getAllAdmin();
	}

	@DeleteMapping("/deleteemployee")
	public void deleteAdmin(@PathVariable int id) {
		service.deleteAdmin(id);
	}

}
