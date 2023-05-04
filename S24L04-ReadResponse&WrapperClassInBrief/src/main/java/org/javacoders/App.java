package org.javacoders;

import org.javacoders.model.Brand;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

public class App {
	
	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client.target("http://localhost:2025/S22L09-HATEOAS/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");
	
	public static void main(String[] args) {
		
		Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.get(Brand[].class);
		for(Brand brand: response) {
			System.out.println(brand);
		}
	}
}
