package org.javacoders.spring.model;

import java.util.Arrays;

import jakarta.validation.constraints.Email;

public class User {
	
	private int userId;
	private String name;
	private String gender;
	
	@Email
	private String email;
	
	private String country;
	private String introduction;
	private String visitedCountries[];
	
	public User() {}

	public User(int userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	public User(int userId, String name, String gender, String email, String country, @Email String introduction,
			String[] visitedCountries) {
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.country = country;
		this.introduction = introduction;
		this.visitedCountries = visitedCountries;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String[] getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", gender=" + gender + ", email=" + email + ", country="
				+ country + ", introduction=" + introduction + ", visitedCountries=" + Arrays.toString(visitedCountries)
				+ "]";
	}
	
	
}
