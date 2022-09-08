package com.testvagrant.pojo;

import java.util.List;

import org.apache.juneau.annotation.Beanc;

/**
 * This class is the POJO representation of Team details
 * 
 * @author magesh.nagamani
 *
 */
public class Team {

	private String name;
	private String location;
	private List<Player> player;

	/**
	 * Constructor of the class Team
	 * 
	 * @param name
	 * @param location
	 * @param player
	 */
	@Beanc(properties = "name,location,player")
	public Team(String name, String location, List<Player> player) {
		this.name = name;
		this.location = location;
		this.player = player;
	}

	/**
	 * @return Returns the team name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method is used to set the team name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the team location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * This method is used to set the team location
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return Returns the players list
	 */
	public List<Player> getPlayer() {
		return player;
	}

	/**
	 * This method is used to set players list
	 * 
	 * @param player
	 */
	public void setPlayer(List<Player> player) {
		this.player = player;
	}

}
