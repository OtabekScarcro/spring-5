package org.javacoders.showroom.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity(name="brands")
@Table(name="brands")
public class Brand {
	
	@Id
	@Column(name="brandId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	
	@Column(name="brandName")
	private String brandName;
	
	@Transient
	private List<Link> links;

	public Brand() {}

	public Brand(int brandId, String brandName) {
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "BrandEntity [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

	public void addBrand(Brand brand) {}
	
}
