package com.forecast.microservice.entity;



public class City {
	
	private int id;
	private String 	name;
	private Coord coord;
	private String country;
	private String population;
	private String timezone;
	private int sunrise;
	private int sunset;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public int getSunrise() {
		return sunrise;
	}
	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}
	public int getSunset() {
		return sunset;
	}
	public void setSunset(int sunset) {
		this.sunset = sunset;
	}
	
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", coord=" + coord + ", country=" + country + ", population="
				+ population + ", timezone=" + timezone + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}
	
	
	
	
	
}
