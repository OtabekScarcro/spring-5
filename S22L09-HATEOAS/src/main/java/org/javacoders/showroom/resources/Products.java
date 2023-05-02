package org.javacoders.showroom.resources;

import java.util.List;

import org.javacoders.showroom.model.Product;
import org.javacoders.showroom.services.ProductsService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom/brands")
public class Products {
	ProductsService productsService = new ProductsService();
	
	@GET
	@Path("/{brandId}/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category, @QueryParam("start") int start,
			@QueryParam("end") int end) {
		
		List<Product> productList;
		if(category != null) {
			productList = productsService.getProductsByBrandAndCategory(brandId, category);
		}
		else {
			productList = productsService.getProductsByBrand(brandId);
		}
		if(end > 0) {
			productList = productList.subList(start, end);
		}
		return productList;
	}
}
