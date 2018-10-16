package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.BookingService;

@Component
public class SetterInjection {
	
	@Autowired
	private BookingService bookingService;

	@Autowired
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public String booking() {
		return bookingService.bookTrip();
	}

}
