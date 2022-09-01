package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.FlightRepository;
import com.hnt.entity.Flight;

@Service
public class FlightService {
	
	@Autowired
	FlightRepository flightRepository;
	
	public Iterable<Flight> getflights(){
		return flightRepository.findAll();
	}
	
	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}

}
