package com.flyersInc.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer airlineId;
	private String airlineName;
	private boolean airlineStatus;
	
	public String getAirlineName() {
		return airlineName;
	}
	public boolean isAirlineStatus() {
		return airlineStatus;
	}
	public void setAirlineStatus(boolean airlineStatus) {
		this.airlineStatus = airlineStatus;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
}
