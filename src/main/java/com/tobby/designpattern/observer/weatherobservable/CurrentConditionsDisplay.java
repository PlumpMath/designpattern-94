package com.tobby.designpattern.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("unused")
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable observable;

	private float temperature;

	private float humidity;

	private float pressure;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
