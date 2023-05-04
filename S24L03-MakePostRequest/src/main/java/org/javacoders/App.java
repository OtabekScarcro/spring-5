package org.javacoders;

import org.javacoders.model.Brand;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class App {
	
	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client.target("http://localhost:2025/S22L09-HATEOAS/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");
	
	public static void main(String[] args) {
		
		Response response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.post(Entity.json(new Brand("Spark")));
		System.out.println(response.readEntity(String.class));
	}
}
