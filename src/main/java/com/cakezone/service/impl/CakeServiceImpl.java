package com.cakezone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakezone.model.Cakes;
import com.cakezone.repository.CakeRepository;
import com.cakezone.service.cakeService;
@Service
public class CakeServiceImpl implements cakeService {

	@Autowired
	private CakeRepository repository;
	
	@Override
	public Cakes addcake(Cakes food) {
		// TODO Auto-generated method stub
		return repository.save(food);
	}

	@Override
	public void deleteCake(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);;
	}

	@Override
	public List<Cakes> getAllCakes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	@Override
	public void updateCake(String cakename, int price, String avthar,String description, int cakeid) {
		repository.updatecake(avthar, cakename, price, description,cakeid);
	}
	
	

}
