package com.cakezone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cakezone.model.Users;
@Repository
public interface CustomerRegisterRepository extends JpaRepository<Users, Integer> {
	public Users findByEmailAndPassword(String useremail,String password);
	
	//; 
}
