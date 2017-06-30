package com.jdpaley.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Room {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private String address;
	private String city;
	private String state;
	private Double price;
	
	private String description;
	private String rules;
	private Boolean wifi;
	private String cable;
	private Boolean prvBath;
	
	private Boolean isRented;
	
	//=======================================================
	
	public Long getId() {
		return Id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}

	public Boolean getPrvBath() {
		return prvBath;
	}

	public void setPrvBath(Boolean prvBath) {
		this.prvBath = prvBath;
	}

	public Boolean getIsRented() {
		return isRented;
	}

	public void setIsRented(Boolean isRented) {
		this.isRented = isRented;
	}
	
}
