package com.hjd.headefirst.design.observermode.test;

import com.hjd.headefirst.design.observermode.service.CurrentConditionsDisplay;
import com.hjd.headefirst.design.observermode.service.ForecastDisplay;
import com.hjd.headefirst.design.observermode.service.StatisticsDisplay;
import com.hjd.headefirst.design.observermode.service.WeatherData;

/**
 * 
 * @author hujiande
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);}
}
