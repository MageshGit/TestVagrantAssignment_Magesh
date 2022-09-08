package com.testvagrant.pojo;

import org.apache.juneau.annotation.Beanc;

/**
 * This class is the POJO representation of Players list and their meta data
 * 
 * @author magesh.nagamani
 *
 */
public class Player {
	private String name;
	private String country;
	private String role;
	private String priceInCrores;

	/**
	 * Constructor of the class Player
	 * 
	 * @param name
	 * @param country
	 * @param role
	 * @param priceInCrores
	 */
	@Beanc(properties = "name, country, role, priceInCrores")
	public Player(String name, String country, String role, String priceInCrores) {
		this.name = name;
		this.country = country;
		this.role = role;
		this.priceInCrores = priceInCrores;
	}

	/**
	 * @return Returns the player name
	 */
	public String getName() {
		return name.toLowerCase();
	}

	/**
	 * This method is used to set the player name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the player's country
	 */
	public String getCountry() {
		return country.toLowerCase();
	}

	/**
	 * This method is used to set the player's country
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return Returns the player's role
	 */
	public String getRole() {
		return role.toLowerCase();
	}

	/**
	 * This method is used to set the player's role
	 * 
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return Returns the player's price
	 */
	public String getPriceInCrores() {
		return priceInCrores.toLowerCase();
	}

	/**
	 * This method is used to set the player's price
	 * 
	 * @param priceInCrores
	 */
	public void setPriceInCrores(String priceInCrores) {
		this.priceInCrores = priceInCrores;
	}
}
