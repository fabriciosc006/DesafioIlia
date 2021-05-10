package requests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class DELETEvotes extends POSTvotes {

	    public void DELETvotes()
	    {
	    	given()
	    	    .header("x-api-key",token)
	    	    .contentType("application/json")
	    	    .pathParam("vote_id", stringid)
	    	.when()
	    	.delete("https://api.thecatapi.com/v1/votes/{vote_id}")
	    	.then()
	    	   .statusCode(200)
	    	   .body("message", is ("SUCESS"))
	    	   .log().all();
	    	
	    	
	    }
	
	
}
