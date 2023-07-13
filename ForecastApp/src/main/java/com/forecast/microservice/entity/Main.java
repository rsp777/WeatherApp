package com.forecast.microservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {

	private Double temp;
	private Double feels_like;
	private Double temp_min;
	private Double temp_max;
	private Integer pressure;
	private Integer humidity;
	private Double sea_level;
	private Double grnd_level;	

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(Double feels_like) {
		this.feels_like = feels_like;
	}

	public Double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}

	public Double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Double getSea_level() {
		return sea_level;
	}

	public void setSea_level(Double sea_level) {
		this.sea_level = sea_level;
	}

	public Double getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(Double grnd_level) {
		this.grnd_level = grnd_level;
	}

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max=" + temp_max
				+ ", pressure=" + pressure + ", humidity=" + humidity + ", sea_level=" + sea_level + ", grnd_level="
				+ grnd_level + "]";
	}
	
	

}
