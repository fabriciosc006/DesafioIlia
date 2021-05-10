package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;


import requests.*;



public class CatApi {
	
	POSTvotes postvotes = new POSTvotes();
	DELETEvotes deletevotes = new DELETEvotes();		
	
	@Given("^acess to The Cat Api$")
	public void acess_to_The_Cat_Api()  {
	    RestAssured.baseURI = "https://api.thecatapi.com/";		
	}
	@When("^give a POST to vote with token \"([^\"]*)\"$")
	public void give_a_POST_to_vote_with_token(String token)  {
	    postvotes.POSTvotesrequest(token);	    
	}

	@Then("^receive request status$")
	public void receive_request_status()  {
	    	    	    
	}

	@When("^remove a vote with received id$")
	public void remove_a_vote_with_received_id() {
		deletevotes.DELETvotes();
	    
	}

	@Then("^receive remove status$")
	public void receive_remove_status()  {
	    
	}


}
