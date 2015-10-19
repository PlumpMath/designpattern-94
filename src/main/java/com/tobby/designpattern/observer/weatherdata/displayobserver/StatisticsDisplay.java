package com.tobby.designpattern.observer.weatherdata.displayobserver;

import com.tobby.designpattern.observer.weatherdata.DisplayElement;
import com.tobby.designpattern.observer.weatherdata.Observer;
import com.tobby.designpattern.observer.weatherdata.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float minTemperature = Float.MAX_VALUE;

	private float maxTemperature = 0;

	private float averageTemperature = 0;

	private int temperatureCount = 0;

	private float temperatureSum = 0;

	@SuppressWarnings("unused")
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		temperatureCount ++;
		temperatureSum += temperature;
		if (temperature < minTemperature) {
			minTemperature = temperature;
		}
		if (temperature > maxTemperature) {
			maxTemperature = temperature;
		}
		averageTemperature = temperatureSum / temperatureCount;
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
	}

}
