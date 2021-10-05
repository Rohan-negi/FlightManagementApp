package com.flyersInc.controllers;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	public int bookFlight(Bookings booking) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10000);
		booking.setTicketPnrNumber(randomNumber);
		bookingRepository.save(booking);
		return booking.getTicketPnrNumber();
	}

	public List<Bookings> findAllTiketsByEmail(String emailId) {
		return bookingRepository.findByPassengerEmail(emailId);
	}

	@Transactional
	public String deleteAFlightEntry(int pnrId) {
		bookingRepository.deleteByTicketPnrNumber(pnrId);
		return "Ticket successfully cancelled";
	}

	public Bookings getFlightsDetails(int pnrId) {
		return bookingRepository.findByTicketPnrNumber(pnrId);
	}
}
