package com.restAssured.base;

import com.restAssured.actions.AssertActions;
import com.restAssured.endpoints.APIConstants;
import com.restAssured.modules.PayloadManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public RequestSpecification requestSpecification;
	public AssertActions assertActions;
	public PayloadManager payloadManager;
	public JsonPath jsonPath;
	public Response response;
	public ValidatableResponse validatableResponse;

	@BeforeTest
	public void setConfig(){

		payloadManager = new PayloadManager();
		assertActions = new AssertActions();
		requestSpecification = new RequestSpecBuilder().setBaseUri(APIConstants.BASE_URL)
										.addHeader("Content-Type", "application/json")
										.build().log().all();
	}

	public String getToken(){
		return null;
	}
}
