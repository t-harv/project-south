package com.ghost.writing.components;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String streetAddress;
	private String state;
	private String city;
	
	public Address() {
		streetAddress = "Unknown";
		state  = "Unknown";
		city  = "Unknown";
	}
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
//	/**
//	 * @return the id
//	 */
//	public long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(long id) {
//		this.id = id;
//	}

}
