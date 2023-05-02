package org.javacoders.showroom.resources;

import jakarta.servlet.ServletContext;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class Demo {
	
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerValue,
			@CookieParam("_xsrf") String xsrf) {
		return "Header Value: " + headerValue + "Cookie Param: " + xsrf;
	}
	
	@GET
	@Path("path")
	public String contextDemo() {
		return "Absolute path: " + uriInfo.getAbsolutePath().toString();
	}
	
	@GET
	@Path("headers")
	public String contextHeader(@Context HttpHeaders header) {
		return "Header keys: " + header.getRequestHeaders().keySet().toString();
	}
}


















 