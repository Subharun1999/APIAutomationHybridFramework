package com.restAssured.modules;

import com.google.gson.Gson;
import com.restAssured.pojos.Booking;
import com.restAssured.pojos.BookingDates;
import com.restAssured.pojos.BookingResponse;

public class PayloadManager {

	Gson gson;
	public String createPayloadBookingAsString(){

		Booking booking = new Booking();
		booking.setFirstname("John");
		booking.setLastname("Doe");
		booking.setTotalprice(2500);
		booking.setDepositpaid(true);
		booking.setAdditionalneeds("Lunch, Dinner");

		BookingDates bookingdates = new BookingDates();
		bookingdates.setCheckin("2024-05-06");
		bookingdates.setCheckout("2024-05-09");
		booking.setBookingDates(bookingdates);
		gson = new Gson();
		return gson.toJson(booking);
	}

	public String fullUpdatePayloadBookingAsString(){

		Booking booking = new Booking();
		booking.setFirstname("Joseph");
		booking.setLastname("Doe");
		booking.setTotalprice(1800);
		booking.setDepositpaid(true);
		booking.setAdditionalneeds("Dinner ");

		BookingDates bookingdates = new BookingDates();
		bookingdates.setCheckin("2024-05-06");
		bookingdates.setCheckout("2024-05-09");
		booking.setBookingDates(bookingdates);
		gson = new Gson();
		return gson.toJson(booking);
	}

	public BookingResponse bookingResponse(String responseString){

		Gson gson = new Gson();
		BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
		return bookingResponse;
	}
}
