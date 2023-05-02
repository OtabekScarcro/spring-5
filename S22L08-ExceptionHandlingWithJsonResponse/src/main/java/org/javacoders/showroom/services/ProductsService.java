package org.javacoders.showroom.services;

import java.util.List;

import org.javacoders.showroom.hibernate.DAO.ProductsDAO;
import org.javacoders.showroom.model.Product;

public class ProductsService {

	ProductsDAO dao = new ProductsDAO();
	
	public List<Product> getProductsByBrand(int brandId) {
		List<Product> productList = dao.getProductsByBrand(brandId);
		return productList;
	}

	public List<Product> getProductsByBrandAndCategory(int brandId, String category) {
		List<Product> productList = dao.getProductsByBrandAndCategory(brandId, category);
		return productList;
	}
	
}
