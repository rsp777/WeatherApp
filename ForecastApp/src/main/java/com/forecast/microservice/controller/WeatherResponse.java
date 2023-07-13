package com.forecast.microservice.controller;

import java.util.logging.Logger;


public class WeatherResponse {

	private int cod;
	private String message;
	private final Logger logger = Logger.getLogger(WeatherResponse.class.getName());

	
	
	public WeatherResponse() {
		
	}
	
	public WeatherResponse(int cod, String message) {
		this.cod = cod;
		this.message = message;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
