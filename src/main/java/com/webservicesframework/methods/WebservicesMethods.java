package com.webservicesframework.methods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.webservicesframework.helpers.AuthorizationClass;

public class WebservicesMethods {
	
	public static Response Post(String uRI, String StringJson) {
		RequestSpecification requestSpecification = RestAssured.given().body(StringJson);
		requestSpecification.contentType(ContentType.JSON);
		//requestSpecification.
		AuthorizationClass authorizationClass = new AuthorizationClass();
	//	System.out.println(authorizationClass.oauth());
		Response response = requestSpecification.post(uRI);
		return response;
	}
	
	public static Response Get(String uRI) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.get(uRI);
		return response;
	}
	
	public static Response Put(String uRI, String StringJson) {
		RequestSpecification requestSpecification = RestAssured.given().body(StringJson);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.put(uRI);
		return response;
	}

}
