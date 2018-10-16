package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.BookingService;

@Component
public class PropertyInjection {
	
	@Autowired
	private BookingService bookingService;
	
	public String booking() {
		return bookingService.bookTrip();
	}

}
