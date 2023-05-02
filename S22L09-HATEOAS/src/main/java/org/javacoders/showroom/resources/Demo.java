package org.javacoders.showroom.resources;

import org.javacoders.showroom.model.ErrorPayload;

import jakarta.servlet.ServletContext;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("/")
public class Demo {
	
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerValue,
			@CookieParam("_xsrf") String xsrf) {
		return "Hello Jax-rs";
		//return "Header Value: " + headerValue + "Cookie Param: " + xsrf;
	}
	
	@GET
	@Path("/path")
	@Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
	public String contextDemo(@HeaderParam("header") String header)throws Exception {
		if(header == null) {
			throw new NotFoundException();
		}
		return "The value of custom header value is: " + header;
	}
	
	@GET
	@Path("/headers")
	public String contextHeader(@Context HttpHeaders header) {
		return "Header keys: " + header.getRequestHeaders().keySet().toString();
	}
}


















 