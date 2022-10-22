package com.cakezone.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cakezone.model.Users;

@Repository
public interface CustomerRepository extends JpaRepository<Users, Integer> {

	@Modifying
	@Transactional
	@Query(value="update users c set c.username =:username,c.email=:email,c.password=:password where userid=:userid",nativeQuery = true)
	void updateuser(@Param("username")String username, @Param("email")String email,@Param("password")String password,@Param("userid")int userid);

}
