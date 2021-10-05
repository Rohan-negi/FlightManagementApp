package com.flyersInc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class UserController {
	
	@Autowired 
	FlightService flightService;
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/airline/getFlights")
	public List<Flight> getFlights(@RequestBody Flight flight) {
		return flightService.findRequiredFlights(flight);
	}
	
	@GetMapping("/booking/history/{emailId}")
	public List<Bookings> getBookedFlightsHistory(@PathVariable(value="emailId") String emailId){
		return bookingService.findAllTiketsByEmail(emailId);
	}
	
	@PostMapping("/booking")
	public Integer bookAFlight(@RequestBody Bookings booking) {
		return bookingService.bookFlight(booking); 
	}
	
	@GetMapping("/ticket/{pnr}")
	public Bookings flightDetails(@PathVariable(value="pnr") int pnrId) {
		return bookingService.getFlightsDetails(pnrId);
	}
	
	@PostMapping("/booking/cancel/{pnr}")
	public String cancelAFlight(@PathVariable(value="pnr") int pnrId) {
		return bookingService.deleteAFlightEntry(pnrId);
	}
}
