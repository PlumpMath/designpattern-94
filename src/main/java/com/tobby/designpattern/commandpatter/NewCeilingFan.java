package com.tobby.designpattern.commandpatter;

public class NewCeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	private String location;
	private int speed;

	public NewCeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high() {
		System.out.println(location + " ceilingFan is on high");
		speed = HIGH;
	}

	public void medium() {
		System.out.println(location + " ceilingFan is on medium");
		speed = MEDIUM;
	}

	public void low() {
		System.out.println(location + " ceilingFan is on low");
		speed = LOW;
	}

	public void off() {
		System.out.println(location + " ceilingFan is off");
		speed = OFF;
	}

	public int getSpeed() {
		return speed;
	}

}
