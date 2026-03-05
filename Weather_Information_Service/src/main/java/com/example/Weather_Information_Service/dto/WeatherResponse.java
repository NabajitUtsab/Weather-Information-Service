package com.example.Weather_Information_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WeatherResponse {

    private Double latitude;
    private Double longitude;
    private Double temperature_c;
    private Double wind_kph;
    private Integer humidity;
}



