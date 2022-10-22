package com.cakezone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakezone.model.Admin;
import com.cakezone.repository.AdminRepository;
import com.cakezone.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repository;

	@Override
	public Admin addAdmin(Admin admin) {
		return repository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		return repository.findAll();
	}

	@Override
	public void deleteAdmin(int id) {
		repository.deleteById(id);
	}

}
