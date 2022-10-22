package com.cakezone.service;

import java.util.List;

import com.cakezone.model.Cakes;

public interface cakeService {

		Cakes addcake(Cakes food);
		void deleteCake(int id);
		List<Cakes> getAllCakes();
		void updateCake(String cakename, int price,String description , String avthar, int cakeid);
		
	
}
