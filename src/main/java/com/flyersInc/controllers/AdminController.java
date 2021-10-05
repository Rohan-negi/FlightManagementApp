package com.flyersInc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminController {
	
	@Autowired 
	FlightService flightService;
	
	@GetMapping("/airline/getall")
	public List<Flight> getAllFlights() {
		return flightService.findAllFlights();
	}
	
	@PostMapping("/airline/inventory/add")
	public Flight addNewFlightService(@RequestBody Flight flight) {
		return flightService.addFlight(flight);
	}
	
	

}
