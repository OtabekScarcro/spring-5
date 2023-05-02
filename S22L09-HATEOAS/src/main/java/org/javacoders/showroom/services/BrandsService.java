package org.javacoders.showroom.services;

import java.util.List;

import org.javacoders.showroom.hibernate.DAO.BrandsDAO;
import org.javacoders.showroom.model.Brand;
import org.javacoders.showroom.model.Product;

public class BrandsService {
	
	BrandsDAO dao = new BrandsDAO();

	public List<Brand> getBrands() {
		List<Brand> list = dao.getBrands();
		return list;
	}
	
	public void addBrand(Brand brand) {
		dao.addBrand(brand);
	}

	public void updateBrand(Brand updatedBrand) {
		dao.updateBrand(updatedBrand);
	}

	public void deleteBrand(int brandId) {
		dao.deleteBrand(brandId);
	}

	public Brand getBrand(int brandId) {
		return dao.getBrand(brandId);
	}

}
