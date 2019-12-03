package com.training.dao;

import java.util.List;

import com.training.beans.Bike;

public interface BikeDao {

	int registerBike(Bike b);

	List<Bike> getBike();
	
	

}
