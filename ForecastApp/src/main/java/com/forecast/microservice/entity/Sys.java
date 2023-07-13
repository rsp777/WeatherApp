package com.forecast.microservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Sys {
	
	@JsonProperty("type")
	private Integer type;
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("country")
	private String country;
	
	@JsonProperty("sunrise")
	private Long sunrise;
	
	@JsonProperty("sunset")
	private Long sunset;
	
	@JsonProperty("pod")
	private String pod;
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getSunrise() {
		return sunrise;
	}

	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}

	public Long getSunset() {
		return sunset;
	}

	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}
	
	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	@Override
	public String toString() {
		return "Sys [type=" + type + ", id=" + id + ", country=" + country + ", sunrise=" + sunrise + ", sunset="
				+ sunset + ", pod=" + pod + "]";
	}

	
	

	
	
}
