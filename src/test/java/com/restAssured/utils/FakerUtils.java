package com.restAssured.utils;

import com.github.javafaker.Faker;

public class FakerUtils {

	Faker faker = new Faker();

	public String getFirstname(){
		return faker.name().firstName();
	}

	public String getLastName(){
		return faker.name().lastName();
	}
}
