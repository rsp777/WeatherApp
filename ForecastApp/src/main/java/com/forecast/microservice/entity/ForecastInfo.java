package com.forecast.microservice.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ForecastInfo {

	@JsonProperty("cod")
	private Integer cod;

	@JsonProperty("message")
	private String message;

	@JsonProperty("cnt")
	private Integer cnt;

	@JsonProperty("list")
	private List<WeatherInfo> list;

	@JsonProperty("city")
	private City city;

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public List<WeatherInfo> getList() {
		return list;
	}

	public void setList(List<WeatherInfo> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ForecastInfo [cod=" + cod + ", message=" + message + ", cnt=" + cnt + ", list=" + list + "]";
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
