package com.restAssured.pojos;

public class Booking {

	String firstname;
	String lastname ;
	Integer totalprice ;
	Boolean depositpaid ;
	BookingDates bookingdates;
	String additionalneeds ;

	public Boolean getDepositpaid() {
		return depositpaid;
	}

	public void setDepositpaid(Boolean depositpaid) {
		this.depositpaid = depositpaid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}

	public BookingDates getBookingDates() {
		return bookingdates;
	}

	public void setBookingDates(BookingDates bookingDates) {
		this.bookingdates = bookingDates;
	}

	public String getAdditionalneeds() {
		return additionalneeds;
	}

	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}

	@Override
	public String toString() {
		return "Booking{" +
				"firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", totalprice=" + totalprice +
				", depositpaid=" + depositpaid +
				", bookingdates=" + bookingdates +
				", additionalneeds=" + additionalneeds +
				'}';
	}
}
