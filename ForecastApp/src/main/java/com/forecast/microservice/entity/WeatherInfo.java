package com.forecast.microservice.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class WeatherInfo {

	@JsonProperty("coord")
	private Coord coord;

	@JsonProperty("weather")
	private List<Weather> weather;

	@JsonProperty("base")
	private String base;

	@JsonProperty("main")
	private Main main;

	@JsonProperty("visibility")
	private Integer visibility;

	@JsonProperty("wind")
	private Wind wind;

	@JsonProperty("clouds")
	private Clouds clouds;

	@JsonProperty("rain")
	private Rain rain;

	@JsonProperty("snow")
	private Snow snow;

	@JsonProperty("dt")
	private Long dt;

	@JsonProperty("sys")
	private Sys sys;

	@JsonProperty("timezone")
	private Integer timezone;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cod")
	private String cod;

	@JsonProperty("message")
	private String message;

	@JsonProperty("pop")
	private Integer pop;

	@JsonProperty("dt_txt")
	private String dt_txt;

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Long getDt() {
		return dt;
	}

	public void setDt(Long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public Integer getTimezone() {
		return timezone;
	}

	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Snow getSnow() {
		return snow;
	}

	public void setSnow(Snow snow) {
		this.snow = snow;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

	public Integer getPop() {
		return pop;
	}

	public void setPop(Integer pop) {
		this.pop = pop;
	}

	@Override
	public String toString() {

		if (message == null) {
			return "WeatherInfo [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
					+ ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", rain=" + rain
					+ ", snow=" + snow + ", dt=" + dt + ", sys=" + sys + ", timezone=" + timezone + ", id=" + id
					+ ", name=" + name + ", cod=" + cod + ", message=" + message + ", pop=" + pop + ", dt_txt=" + dt_txt
					+ "]";
		} else {
			return "WeatherInfo [cod=" + cod + ", message=" + message + "]";
		}

	}

}
