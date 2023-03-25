package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String[] operatingSYstems;
	
	private LinkedHashMap<String,String> countryOptions;
	public Student() {
		
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String[] getOperatingSYstems() {
		return operatingSYstems;
	}
	public void setOperatingSYstems(String[] operatingSYstems) {
		this.operatingSYstems = operatingSYstems;
	}
	
}
