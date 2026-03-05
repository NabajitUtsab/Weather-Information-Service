# Weather Information Service API

A REST API that fetches real-time weather data for a given city, powered by an external weather provider (WeatherAPI).

---

## Base URL

```
http://localhost:8080
```

---

## Endpoints

### Get Weather by City

**GET** `/api/weather`

Returns current weather information for the specified city.


#### Example Request

```
GET /api/weather?cityName=Chittagong
```

#### Response — `200 OK`

```json
{
    "latitude": 22.3636,
    "longitude": 91.8033,
    "temperature_c": 24.4,
    "wind_kph": 10.1,
    "humidity": 89
}
```

| Field | Type | Description |
|---|---|---|
| `latitude` | `number` | Latitude of the city |
| `longitude` | `number` | Longitude of the city |
| `temperature` | `number` | Current temperature in **°C** |
| `wind` | `number` | Current wind speed in **km/h** |
| `humidity` | `integer` | Current humidity as a **percentage (%)** |

---

## Error Handling

All errors are returned with a `400 Bad Request` status and a JSON body containing an `error` field.

#### Response — `400 Bad Request`

```json
{
  "error": "City must not be empty"
}
```

| Scenario | Error Message |
|---|---|
| `cityName` is blank or missing | `"City must not be empty"` |
| City not found / external API error | Message from the upstream API or service |

---

## Configuration

The service requires the following properties to be set (e.g. in `application.properties`):

```properties
weather.api.key=WEATHER_API_KEY
weather.api.url=https://api.weatherapi.com/v1/current.json
```

WEATHER_API_KEY sets as an environment variable.
