package com.forecast.microservice.service;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.forecast.microservice.entity.ForecastInfo;

@Service
public class ForecastService {

	private final Logger logger = Logger.getLogger(ForecastService.class.getName());
	private static final String API_KEY = "f777fa895ebe5cb38334176de19e5693";
	private static final String FORECAST_API_URL = "http://api.openweathermap.org/data/2.5/forecast";
	private static final String FORECAST_PARMS = "%s?q=%s&appid=%s&units=metric&lang=en&cnt=%s";

	private ForecastInfo forecastInfo;
	private final HttpClient httpClient;
	private final ObjectMapper objectMapper;

	public String encodedCity;
	// @Autowired
	// private HttpServletRequest requestt;

	public ForecastService() {
		httpClient = HttpClients.createDefault();
		objectMapper = new ObjectMapper();

	}

	public ForecastInfo getForecastInfo(String city) throws IOException, ClientProtocolException {
		if (city != null) {
			encodedCity = encodedCity(city);
			String cnt = "5";
			cnt.replace(" ", "");
			String jsonForecastResponse = jsonForecastResponse(FORECAST_PARMS, FORECAST_API_URL, encodedCity, API_KEY,
					cnt);
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			forecastInfo = objectMapper.readValue(jsonForecastResponse, ForecastInfo.class);
			logger.info("ForecastInfo : "+forecastInfo);
			logger.info("Forecast fetched for " + encodedCity.toUpperCase());
			return forecastInfo;
		}
		return forecastInfo;
	}

	public String jsonForecastResponse(String PARAMS, String FORECAST_API_URL, String city, String API_KEY, String cnt)
			throws ClientProtocolException, IOException {
		String forecastUrl = String.format(PARAMS, FORECAST_API_URL, city, API_KEY, cnt);
//		logger.info("Forecast URL : " + forecastUrl);
		HttpGet request = new HttpGet(forecastUrl);
		HttpResponse response = httpClient.execute(request);
		HttpEntity entity = response.getEntity();
		String json = EntityUtils.toString(entity);
		logger.info("Json Response : " + json);
		logger.info("response inside " + getClass() + ": " + response.getStatusLine());
		return json;
	}

	public String encodedCity(String city) {
		
		if (city.matches(".*\\s.*") && city != null) {
			logger.info("City with space : " + city);
			Pattern p = Pattern.compile("[\\s]");
			Matcher mat = p.matcher(city);
			encodedCity = mat.replaceAll("");
			logger.info("City with no space : " + encodedCity);

			return encodedCity;
		}
		logger.info("Perfect City with no spaces : "+city);
		return city;

	}
}
