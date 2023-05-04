package org.javacoders;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("app")
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(@QueryParam("code") Currency currency) {
		return "Currency : " + currency;
	}
}
