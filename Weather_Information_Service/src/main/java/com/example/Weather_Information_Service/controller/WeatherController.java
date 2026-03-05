package com.example.Weather_Information_Service.controller;

import com.example.Weather_Information_Service.dto.WeatherResponse;
import com.example.Weather_Information_Service.service.WeatherService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public WeatherResponse getWeather(@Valid @RequestParam @NotBlank(message = "City must not be empty") String cityName) {

        return weatherService.getWeatherByCity(cityName);
    }
}
