package com.tobby.designpattern.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0;

	private float minTemp = 200;

	private float tempSum = 0;

	private int numReadings;

	public StatisticsDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			float temp = weatherData.getTemperature();
			numReadings ++;
			tempSum += temp;
			if (temp > maxTemp) {
				maxTemp = temp;
			}
			if (temp < minTemp) {
				minTemp = temp;
			}
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + tempSum / numReadings + "/" + maxTemp + "/" + minTemp);
	}

}
