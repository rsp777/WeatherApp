package com.forecast.microservice.config;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Config {
	
	private final Logger logger = Logger.getLogger(Config.class.getName());
	
	@Value("${weather.key}")
	private String key;
	
	@Value("${weather.url}")
	private String url;
	
	@Value("${weather.params}")
	private String params;
	
	@Autowired
	private Environment environment;
	
	public String getKey() {
//		logger.info("API_KEY fetched");
		return environment.getProperty("weather.key");
	}
	public String getUrl() {
//		logger.info("API_URL fetched");
		return environment.getProperty("weather.url");
	}
	
	public String getParams() {
//		logger.info("API_PARAMS fetched");
		return environment.getProperty("weather.params");
	}
	
	
	
}
