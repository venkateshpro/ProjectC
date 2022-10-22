package com.cakezone.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cakezone.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

	@Modifying
	@Transactional
	@Query(value="insert into orders(userid,cakeid,cakename,username,price )values(:userid,:cakeid,:cakename,:username,:price)",nativeQuery = true)
	void insertOrder(@Param("userid") int userid, @Param("cakeid")int cakeid,@Param("username") String username, @Param("cakename")String cakename,@Param("price") int price);
	
	
	@Query(value="select * from orders r where r.userid=0?",nativeQuery = true)
	List<Orders> findByUserUserId(int userid);


}
