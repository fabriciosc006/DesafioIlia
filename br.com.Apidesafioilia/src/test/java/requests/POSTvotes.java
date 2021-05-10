package requests;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class POSTvotes {
	    	   
	   RequestSpecification request;
	   Response response;
	   String stringid;
	   String token;
	   
	 public void POSTvotesrequest(String token) {
		 
		          given()
		            .contentType("application/json")
				    .body("{\"image_id\": \"8pb\", \"value\": true, \"sub_id\": \"demo-be2997\"}")
				    .header("x-api-key",token)
		  		  .when()
		  		    .post("https://api.thecatapi.com/v1/votes")
		  		  .then()
		  		     .statusCode(200)
		  		     .body("message", is ("SUCESS"))
		  		     .log().all(); 		  		    
	 }
       
	 public void GETvotes(String token) 
	 {
		       response = given()
			               .header("x-api-key",token)
			               .when()
			               		.get("https://api.thecatapi.com/v1/votes");
			               	response.then()
			               		.statusCode(200)
			               		.body("image_id", hasItems("b","8pb")) 
			               		.log().all(); 
		               
		         stringid = response.jsonPath().get("id[1]");
		       
		 
	 }
    
	 
}
