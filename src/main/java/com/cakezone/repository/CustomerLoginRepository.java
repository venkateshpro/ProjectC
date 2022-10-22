package com.cakezone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cakezone.model.Users;
@Repository
public interface CustomerLoginRepository extends JpaRepository<Users, Integer> {

	Users findByEmailAndPassword(String email,String password);
}
