package com.cakezone.service;

import java.util.List;

import com.cakezone.model.Admin;

public interface AdminService {

	Admin addAdmin(Admin admin);

	List<Admin> getAllAdmin();

	void deleteAdmin(int id);
}
