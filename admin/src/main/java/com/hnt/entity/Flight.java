package com.hnt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightNumber;
	
	@NotBlank(message = "Airline cannot be blank#######")
	private String airline;
	
	@NotBlank(message = "fromPlace cannot be blank#######")
	private String fromPlace;
	
	@NotBlank(message = "toPlace cannot be blank#######")
	private String toPlace;
	
	@Min(value = 1, message = "ticketCost cannot be less than 1")
	private double ticketCost;
	

}
