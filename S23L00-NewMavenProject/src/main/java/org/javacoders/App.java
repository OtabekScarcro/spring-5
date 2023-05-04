package org.javacoders;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("nice")
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		return "I love rest";
	}
}
