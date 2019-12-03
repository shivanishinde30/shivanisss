package com.training.service;

import java.util.List;

import com.training.beans.Bike;

public interface BikeService {

	int registerBike(Bike b);

	List<Bike> getBike();

}
