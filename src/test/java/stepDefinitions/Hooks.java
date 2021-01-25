package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//write the code that iwll give you place id
		//execute this code only when place id is null
		
		stepDefinitions m= new stepDefinitions();
		if (stepDefinitions.place_id==null)
		{	
		m.add_place_payload_with("Mike Fool", "German", "Nowhere");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("Mike Fool", "getPlaceAPI");
	}
	}
}
