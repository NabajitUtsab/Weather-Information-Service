package com.example.Weather_Information_Service.service;

import com.example.Weather_Information_Service.dto.WeatherApiResponse;
import com.example.Weather_Information_Service.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public WeatherResponse getWeatherByCity(String cityName) {

        String url = apiUrl + "?key=" + apiKey + "&q=" + cityName;

        RestTemplate restTemplate = new RestTemplate();

        WeatherApiResponse response = restTemplate.getForObject(url, WeatherApiResponse.class);

        return WeatherResponse.builder().

                latitude(response.getLocation().getLat()).
                longitude(response.getLocation().getLon()).
                temperature_c(response.getCurrent().getTemperature_c()).
                wind_kph(response.getCurrent().getWind_kph()).
                humidity(response.getCurrent().getHumidity()).

                build();


    }
}
