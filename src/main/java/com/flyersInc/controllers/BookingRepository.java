package com.flyersInc.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings, Integer> {
	public List<Bookings> findByPassengerEmail(String emailId);

	public String deleteByTicketPnrNumber(int pnrId);
	
	public Bookings findByTicketPnrNumber(int pnrId);
}
