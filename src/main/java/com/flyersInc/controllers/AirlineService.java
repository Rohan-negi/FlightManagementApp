package com.flyersInc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository airlineRepository;
	
	public  String addNewAirline(Airline airline) {
		airline.setAirlineStatus(true);
		airlineRepository.save(airline);
		return "airline successfully booked";
	}

	public void blockAirlineNow(Airline airline) {
		airlineRepository.findAndBlockAFlight(airline.getAirlineName(),false);
	}
}
