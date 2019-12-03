package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Bike;
import com.training.dao.BikeDao;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	BikeDao bikeDao; 
	@Override
	public int registerBike(Bike b) {
		return bikeDao.registerBike(b);
		
	}
	@Override
	public List<Bike> getBike() {
		return bikeDao.getBike();
	}

}
