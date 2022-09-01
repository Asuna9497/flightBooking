package com.hnt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnt.entity.Admin;
import com.hnt.entity.Flight;
import com.hnt.service.AdminService;
import com.hnt.service.FlightService;

@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController{
	@Autowired
	AdminService adminService;
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/getAdmin")
	Iterable<Admin> getAdmin(){
		return adminService.getAdmin();
	}
	
	@PostMapping("/saveAdmin")
	Integer saveAdmin(@Valid @RequestBody  Admin admin) {
		adminService.save(admin);
		return admin.getAdminId();
	}
	
	@GetMapping("/getFlight")
	Iterable<Flight> getFlights(){
		return flightService.getflights();
	}
	
	@PostMapping("/saveFlight")
	Integer saveFlight(@Valid @RequestBody Flight flight) {
		flightService.saveFlight(flight);
		return flight.getFlightNumber();
	}

}
