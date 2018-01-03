package com.webservicesframework.utility;

public enum EndPointUrl {
	
	GET_All_REPORTS("api/generic/v1/search/advance/cmn_ReportDefinition/"),
	CREATE_REPORT("api/generic/v1/ReportEngine/"),
	CLONE_REPORT("api/generic/v1/ReportEngine/0fe328b4-a5ce-e711-80c2-0004ffb07817/clone");
	
	String resourcePath;
	
	EndPointUrl(String resourcePath) {
		this.resourcePath = resourcePath;
	}
	
	public String getResourcePath() {
		return resourcePath;
	}
	
	public String getResourcePath(String data) {
		return resourcePath;
	}
	
	public static void main(String[] args) {
		System.out.println(EndPointUrl.GET_All_REPORTS);
	}

}
