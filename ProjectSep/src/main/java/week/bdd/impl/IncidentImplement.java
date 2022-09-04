package week.bdd.impl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IncidentImplement {

	public static RequestSpecification inputRequest;
	public static String sys_id, sysparm_fields, description,category,number;
	public static Response response;
	
	
	@Given("User set the endpoint for service now application")
	public void setEndpoint() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://dev61515.service-now.com/api/now/table/incident";
	}
	
	@And("User set the authentication for service now application")
	public void setAuth() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://dev61515.service-now.com/api/now/table/incident";
		inputRequest = RestAssured.given().log().all().auth().basic("admin", "F83uM-iJUIs*");
		
		
	}
	@And("User set the queryparam in the Incident management request")
	public void setQueryParm() {
		// TODO Auto-generated method stub
        inputRequest.queryParam(sys_id, sysparm_fields,description,category,number);
        
		
		
	}
	
	@And("User set the request header in the Incident management request")
	public void setReqHeader() {
		// TODO Auto-generated method stub
      inputRequest.contentType(ContentType.JSON);
		
		
	}
	
	@When("user set the Post request to the service now application")
    public void sentPostRequest() {
		// TODO Auto-generated method stub

		Response response = inputRequest.when().post();
		response.then().log().all();
		
	}
	
	@Then("Verify the status code for the Incident management request")
	public void verifystatuscode() {
		// TODO Auto-generated method stub

		response.then().assertThat().statusCode(201);
		
	}
	
	@Then("Validate the sys_id in the Incident management request")
	public void validatesysid() {
		// TODO Auto-generated method stub
         response.       
	}
	
	
}
