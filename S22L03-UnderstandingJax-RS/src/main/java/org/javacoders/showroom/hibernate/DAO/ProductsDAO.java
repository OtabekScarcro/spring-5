package org.javacoders.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.javacoders.showroom.hibernate.entities.BrandEntity;
import org.javacoders.showroom.hibernate.entities.ProductEntity;

public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ProductEntity.class)
			.addAnnotatedClass(BrandEntity.class)
			.buildSessionFactory();

	
	
	/*
	 * 
	Apr 30, 2023 7:11:43 PM org.apache.catalina.core.StandardWrapperValve invoke
	SEVERE: Servlet.service() for servlet [Jersey Web Application] in context with path [/S22L03-UnderstandingJax-RS] 
	threw exception [java.lang.IllegalArgumentException: org.hibernate.query.SemanticException: Could not interpret 
	path expression 'brandId'] with root cause
	org.hibernate.query.SemanticException: Could not interpret path expression 'brandId'
		
	*/
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<ProductEntity> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL = "from products where brandId = " + brandId;
		productList = session.createQuery(HQL).getResultList();
		System.out.println(productList);
		return productList;
	}

	
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<ProductEntity> getProductsByBrandAndCategory(int brandId, String category) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL = "from products where brandId = " + brandId + " and category = '" + category + "'";
		productList = session.createQuery(HQL).getResultList();
		System.out.println(productList);
		return productList;
	}
	
}
