package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class BookingServiceImpl implements BookingService {

	@Override
	public String bookTrip() {
		String str = "This is method for booking the trip for customer";
		System.out.println(str);
		return str;
	}
	


}
