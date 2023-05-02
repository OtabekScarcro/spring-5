package org.javacoders.showroom.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.javacoders.showroom.model.Brand;
import org.javacoders.showroom.model.Link;
import org.javacoders.showroom.services.BrandsService;

import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/showroom/brands")
public class Brands {
	BrandsService service = new BrandsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Brand> getBrands() {
		List<Brand> list = service.getBrands();
		return list;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{brandId}")
	public Brand getBrand(@PathParam("brandId") int brandId, @Context UriInfo uri) {
		Link self = new Link(uri.getAbsolutePath().toString(), "self");
		
		//Link products = new Link(uri.getAbsolutePathBuilder().path("products").build().toString(), "products");
		String productsUri = uri.getBaseUriBuilder()
				.path(Products.class)
				.path(Products.class, "getProductsByBrand")
				.resolveTemplate("brandId", brandId).toString();
		Link products = new Link(productsUri, "products");
		Brand brand = service.getBrand(brandId);
		
		List<Link> links = new ArrayList<Link>();
		links.add(self);
		links.add(products);
		
		brand.setLinks(links);
		return brand;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postBrands(Brand brand, @Context UriInfo uri) {
		service.addBrand(brand);
		URI location = uri.getAbsolutePathBuilder().path(Integer.toString(brand.getBrandId())).build();
		return Response.created(location).entity(brand).build();
				//.status(Status.CREATED).entity(brand).build();
	}
	
	@PUT
	@Path("/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandId") int brandId, Brand updatedBrand) {
		updatedBrand.setBrandId(brandId);
		service.updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/{brandId}")
	public void deleteBrands(@PathParam("brandId") int brandId) {
		service.deleteBrand(brandId);
	}
	
}

















