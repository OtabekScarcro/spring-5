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
		
		/**
		 * Getting list of brands 
		 *
		Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.get(Brand[].class);
		for(Brand brand: response) {
			System.out.println(brand.displayBrand());
		}
		*/
		
		/**
		 * Getting specific Brand info
		 *
		Brand specificBrand = brandURL
				.resolveTemplate("brandId", "4")
				.request()
				.get(Brand.class);
		System.out.println(specificBrand);
		*/
		
		/**
		 * Adding a new Brand
		 *
		Response response = baseBrandURL
				.request()
				.post(Entity.json(new Brand("Shewrolet")));
		System.out.println(response.readEntity(Brand.class).displayBrand());
		*/
		
		/**
		 * Updating a brand info
		 *
		Response response = brandURL
				.resolveTemplate("brandId", "4")
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.json(new Brand("Kamaz")));
		System.out.println(response.getStatus());
		*/
		
		/**
		 * Deleting a Brand 
		 *
		Response response = brandURL
				.resolveTemplate("brandId", "4")
				.request()
				.delete();
		System.out.println(response.getStatus());
		*/
	}
}
