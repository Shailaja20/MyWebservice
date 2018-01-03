package com.webservicesframework.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.webservicesframework.methods.WebservicesMethods;
import com.webservicesframework.utility.EndPointUrl;
import com.webservicesframework.utility.URL;

public class TestClass {
	Response response;
	
	@Test
	public void verifyGetallReports() {
		String url = URL.fixurl + URL.GET_All_REPORTS;
		System.out.println("Url is :" + url);
		Gson gson = new Gson();
		String json =gson.toJson(new Object());
		response = WebservicesMethods.Post(url, json);
		System.out.println(response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
