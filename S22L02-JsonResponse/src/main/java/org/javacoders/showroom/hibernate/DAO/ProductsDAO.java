package org.javacoders.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javacoders.showroom.hibernate.entities.BrandEntity;
import org.javacoders.showroom.hibernate.entities.ProductEntity;

public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ProductEntity.class)
			.addAnnotatedClass(BrandEntity.class)
			.buildSessionFactory();

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<ProductEntity> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		System.out.println("Hello there");
		String sql = "from products where brandId = " + brandId;
		productList = session.createQuery(sql).getResultList();
		System.out.println(productList);
		return productList;
	}
	
}
