package org.javacoders.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javacoders.showroom.model.Brand;
import org.javacoders.showroom.model.Product;


public class BrandsDAO {

	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Brand.class)
			.buildSessionFactory();
	
	@SuppressWarnings("deprecation")
	public List<Brand> getBrands() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Brand> list = session.createQuery("from brands").getResultList();
		return list;
	}
	
	public Brand getBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		return session.get(Brand.class, brandId);
	}

	public void addBrand(Brand brand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();
	}

	public void updateBrand(Brand updatedBrand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int id = updatedBrand.getBrandId();
		Brand brand = session.get(Brand.class, id);
		//brand = updatedBrand;
		brand.setBrandName(updatedBrand.getBrandName());
		session.getTransaction().commit();
	}

	public void deleteBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Brand brand = session.get(Brand.class, brandId);
		session.delete(brand);
		session.getTransaction().commit();
	}
	
}
