package com.tobby.designpattern.observer.weatherdata.displayobserver;

import com.tobby.designpattern.observer.weatherdata.DisplayElement;
import com.tobby.designpattern.observer.weatherdata.Observer;
import com.tobby.designpattern.observer.weatherdata.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;

	private float humidity;

	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}

}
