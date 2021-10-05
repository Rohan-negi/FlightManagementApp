package com.flyersInc.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightNumber;
	private String airlineCompany;
	private String fromPlace;
	private String toPlace;
	private String instrumentUsed;
	private int businessClassSeats;
	private int nonBusinessClassSeats;
	private float ticketCost;
	private int numberOfRows;
	
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirlineCompany() {
		return airlineCompany;
	}
	public void setAirlineCompany(String airlineCompany) {
		this.airlineCompany = airlineCompany;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public int getBusinessClassSeats() {
		return businessClassSeats;
	}
	public void setBusinessClassSeats(int businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}
	public int getNonBusinessClassSeats() {
		return nonBusinessClassSeats;
	}
	public void setNonBusinessClassSeats(int nonBusinessClassSeats) {
		this.nonBusinessClassSeats = nonBusinessClassSeats;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int getNumberOfRows() {
		return numberOfRows;
	}
	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
}
