package com.webservicesframework.helpers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;

public class AuthorizationClass {
	
	//Spacing Issue
	//line added
	public RequestSpecification oauth(){
		 RequestSpecification res = RestAssured.given().header("Username", "globaladmin@clmdev-eng.apttuscloud.io")
						   								.header("Password", "Apttu$App$456");
		return res;
	}

}
