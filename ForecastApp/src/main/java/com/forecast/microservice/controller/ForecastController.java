package com.forecast.microservice.controller;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forecast.microservice.entity.ForecastInfo;
import com.forecast.microservice.exceptions.CityNotFoundException;
import com.forecast.microservice.service.ForecastService;
import com.forecast.microservice.config.Config;


@RestController
@RequestMapping(value = "/forecast", method = RequestMethod.GET)
public class ForecastController {
	
	@Autowired
	public Config  config;
	private final Logger logger = Logger.getLogger(ForecastController.class.getName());

	private ForecastService forecastService;
	private ForecastInfo forecastInfo;

	public ForecastController() {
		forecastService = new ForecastService();
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/{city}")
	public ForecastInfo getForecastInfo(@PathVariable String city)
			throws ClientProtocolException, IOException, CityNotFoundException {
		String forecastUrl = config.getUrl();
		String weatherKey = config.getKey();
		String forecastParams = config.getParams();
		logger.info(forecastUrl+weatherKey+forecastParams);
		forecastInfo = forecastService.getForecastInfo(city,  forecastUrl,  weatherKey,  forecastParams);	
		
		if (forecastInfo.getCod() == 404) {
			throw new CityNotFoundException("city not found : " + city);
		}
		else {
			return forecastInfo;
		}

	}
	
	@ExceptionHandler
	public ResponseEntity<WeatherResponse> notFoundResponseEntity(CityNotFoundException cnfe) {

		WeatherResponse weatherResponse = new WeatherResponse();
		weatherResponse.setCod(HttpStatus.NOT_FOUND.value());
		weatherResponse.setMessage(cnfe.getMessage());

		return new ResponseEntity<>(weatherResponse, HttpStatus.NOT_FOUND);

	}
}
