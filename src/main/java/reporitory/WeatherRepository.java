package reporitory;

import Exceptions.WeatherReportNotFoundException;
import model.Coordinates;
import model.CurrentWeatherReport;
import model.ForecastWeatherReport;
import model.WeatherRequest;
import openWeather.OpenWeatherRepository;
import openWeather.OpenWeatherRequest;
import utility.Constants;

import java.io.IOException;

public class WeatherRepository implements Weather {

    @Override
    public CurrentWeatherReport getCurrentWeather(WeatherRequest request) throws WeatherReportNotFoundException {
        throw new WeatherReportNotFoundException("Missing interface implementation");
    }

    @Override
    public ForecastWeatherReport getForecastThreeDays(WeatherRequest request) throws WeatherReportNotFoundException {
        throw new WeatherReportNotFoundException("Missing interface implementation");
    }

}
