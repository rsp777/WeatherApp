package com.forecast.microservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_NULL)
public class Rain {
	
	@JsonProperty("1h")
	private Double oneHourRain;
	
	@JsonProperty("3h")
	private Double threeHourRain;
	/**
	 * @return the oneHourRain
	 */
	public Double getOneHourRain() {
		return oneHourRain;
	}
	/**
	 * @param oneHourRain the oneHourRain to set
	 */
	public void setOneHourRain(Double oneHourRain) {
		this.oneHourRain = oneHourRain;
	}
	/**
	 * @return the threeHourRain
	 */
	public Double getThreeHourRain() {
		return threeHourRain;
	}
	/**
	 * @param threeHourRain the threeHourRain to set
	 */
	public void setThreeHourRain(Double threeHourRain) {
		this.threeHourRain = threeHourRain;
	}
	@Override
	public String toString() {
		return "Rain [oneHourRain=" + oneHourRain + ", threeHourRain=" + threeHourRain + "]";
	}
	
	
	
}
