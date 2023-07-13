package com.forecast.microservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Snow {

	private Double oneHourSnow;
	private Double threeHourSnow;
	/**
	 * @return the oneHourSnow
	 */
	public Double getOneHourSnow() {
		return oneHourSnow;
	}
	/**
	 * @param oneHourSnow the oneHourSnow to set
	 */
	public void setOneHourSnow(Double oneHourSnow) {
		this.oneHourSnow = oneHourSnow;
	}
	/**
	 * @return the threeHourSnow
	 */
	public Double getThreeHourSnow() {
		return threeHourSnow;
	}
	/**
	 * @param threeHourSnow the threeHourSnow to set
	 */
	public void setThreeHourSnow(Double threeHourSnow) {
		this.threeHourSnow = threeHourSnow;
	}
	@Override
	public String toString() {
		return "Snow [oneHourSnow=" + oneHourSnow + ", threeHourSnow=" + threeHourSnow + "]";
	}
	
	
}
