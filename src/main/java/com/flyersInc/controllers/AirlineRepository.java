package com.flyersInc.controllers;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AirlineRepository extends JpaRepository<Airline, Integer> {
	
	// not working
	@Transactional
	@Query("update Airline a set a.airlineStatus = ?2 where a.airlineName = ?1")
	public void findAndBlockAFlight(String airlineName,boolean airlineStatus);
}
