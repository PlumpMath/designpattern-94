package com.tobby.designpattern.observer.weatherdata.displayobserver;

import com.tobby.designpattern.observer.weatherdata.DisplayElement;
import com.tobby.designpattern.observer.weatherdata.Observer;
import com.tobby.designpattern.observer.weatherdata.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;

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
		} else {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
