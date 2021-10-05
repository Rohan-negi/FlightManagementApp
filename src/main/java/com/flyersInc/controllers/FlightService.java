package com.flyersInc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class FlightService {

	@Autowired
	FlightRepository flightRepository;
	
	public Flight addFlight(Flight flight) {
		flightRepository.save(flight);
		return flight;
	}

	public List<Flight> findAllFlights() {
		return flightRepository.findAll();
	}
	
	public List<Flight> findRequiredFlights(Flight flight) {
		return flightRepository.findByFromPlaceAndToPlace(flight.getFromPlace(),flight.getToPlace());
	}
	
}
