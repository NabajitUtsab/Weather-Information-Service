package com.example.Weather_Information_Service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Current {
    @JsonProperty("temp_c")
    private Double temperature_c;

    @JsonProperty("wind_kph")
    private Double wind_kph;

    private int humidity;
}
