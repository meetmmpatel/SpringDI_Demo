package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.BookingService;

@Component
public class ContructorInjection {
	
	@Autowired
	private BookingService bookingService;

	@Autowired
	public ContructorInjection(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}
	
	public String booking() {
		return bookingService.bookTrip();
	}
	

}
