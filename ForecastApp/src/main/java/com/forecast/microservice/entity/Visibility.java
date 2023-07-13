package com.forecast.microservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Visibility {

	private String visiblity;

	public String getVisiblity() {
		return visiblity;
	}

	public void setVisiblity(String visiblity) {
		this.visiblity = visiblity;
	}

	@Override
	public String toString() {
		return "Visibility [visiblity=" + visiblity + "]";
	}
	
	
}
