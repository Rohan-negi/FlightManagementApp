package com.flyersInc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminController {
	
	@Autowired 
	FlightService flightService;
	
	@Autowired
	AirlineService airlineService;
	
	@GetMapping("/airline/getall")
	public List<Flight> getAllFlights() {
		return flightService.findAllFlights();
	}
	
	@PostMapping("/airline/add")
	public String addAirlines(@RequestBody Airline airline) {
		return airlineService.addNewAirline(airline);
	}
	
	@PutMapping("/airline/block")
	public void blockAirline(@RequestBody Airline airline) {
		airlineService.blockAirlineNow(airline);
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="No negative values allowed")
	public class InvalidInputException extends RuntimeException {
		
	}
	
	@PostMapping("/airline/inventory/add")
	public Flight addNewFlightService(@RequestBody Flight flight) {
		int x = flight.getBusinessClassSeats();
		int y = flight.getNonBusinessClassSeats();
		double z = flight.getTicketCost();
		int w = flight.getNumberOfRows();
		if(x<0 || y<0 || z<0 || w<0) {
			throw new InvalidInputException();
		}
		return flightService.addFlight(flight);
	}
}
