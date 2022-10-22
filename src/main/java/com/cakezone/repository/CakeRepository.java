package com.cakezone.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cakezone.model.Cakes;

@Repository
public interface CakeRepository extends JpaRepository<Cakes, Integer> {
	
	@Modifying
	@Transactional
	@Query(value="update cakes c set c.avthar =:avthar,c.cakename=:cakename,c.price=:price,c.description=:description where cakeid=:cakeid",nativeQuery = true)
	void updatecake(@Param("avthar")String avthar,@Param("cakename") String cakename, @Param("price")int price,@Param("description")String description,@Param("cakeid")int cakeid);

}
