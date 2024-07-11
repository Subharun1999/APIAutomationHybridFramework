package com.restAssured.tests.crud;

import com.restAssured.actions.AssertActions;
import com.restAssured.base.BaseTest;
import com.restAssured.endpoints.APIConstants;
import com.restAssured.pojos.BookingResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class testCreateBookingPOST extends BaseTest {

	@Test
	@Owner("Subharun")
	@Severity(SeverityLevel.NORMAL)
	@Description("TC#1 -> Verify That Booking is Created")
	public void testCreateBooking(){

		requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

		response = RestAssured.given(requestSpecification).when()
				.body(payloadManager.createPayloadBookingAsString()).post();

		validatableResponse = response.then().log().all();
		validatableResponse.statusCode(200);

		//Deserialization
		BookingResponse bookingResponse = payloadManager.bookingResponse(response.asString());

		//Using AssertJ to match TCs
		assertThat(bookingResponse.getBookingid()).isNotNull();
		assertThat(bookingResponse.getBooking().getFirstname()).isNotBlank();
		assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("John");

		//TestNG Assertions
		assertActions.verifyStatusCode(response);
	}



}
