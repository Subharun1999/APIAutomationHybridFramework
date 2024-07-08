package com.restAssured.pojos;

public class BookingDates {

	String checkin;
	String checkout;

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	@Override
	public String toString() {
		return "BookingDates{" +
				"checkin='" + checkin + '\'' +
				", checkout='" + checkout + '\'' +
				'}';
	}
}
