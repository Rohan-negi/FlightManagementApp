package com.flyersInc.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	public List<Flight> findByFromPlaceAndToPlace(String fromPlace, String toPlace);

}