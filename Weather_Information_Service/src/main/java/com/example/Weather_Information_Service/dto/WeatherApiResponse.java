package com.example.Weather_Information_Service.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WeatherApiResponse {

    private Location location;
    private Current current;
}
