package org.javacoders;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("app")
@Singleton
public class App {
	
	private int x = 0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		return "Value of x is " + (++x);
	}
}
