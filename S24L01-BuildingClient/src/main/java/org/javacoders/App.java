package org.javacoders;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("app")
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		Client client = ClientBuilder.newClient();
		String response = client.target("http://localhost:2025/S22L09-HATEOAS/showroom/brands/3")
				.request(MediaType.APPLICATION_JSON)
				.get(String.class);
		return response;
	}
}
