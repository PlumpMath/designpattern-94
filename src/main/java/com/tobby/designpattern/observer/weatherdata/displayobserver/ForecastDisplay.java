package com.tobby.designpattern.observer.weatherdata.displayobserver;

import java.security.acl.LastOwnerException;

import com.tobby.designpattern.observer.weatherdata.DisplayElement;
import com.tobby.designpattern.observer.weatherdata.Observer;
import com.tobby.designpattern.observer.weatherdata.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure;

	private float lastPressure;

	@SuppressWarnings("unused")
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
