package org.javacoders.showroom.resources;

import java.util.List;

import org.javacoders.showroom.hibernate.entities.ProductEntity;
import org.javacoders.showroom.services.ProductsService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

//@Path("/showroom/brands")
public class Products {
	ProductsService productsService = new ProductsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category) {
		List<ProductEntity> productList;
		if(category != null) {
			productList = productsService.getProductsByBrandAndCategory(brandId, category);
			return productList;
		}
		else {
			productList = productsService.getProductsByBrand(brandId);
			return productList;
		}
	}
}
