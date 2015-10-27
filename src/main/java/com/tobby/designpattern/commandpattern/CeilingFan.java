package com.tobby.designpattern.commandpattern;

public class CeilingFan {

	private String description;

	public CeilingFan(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " ceiling fan is on high");
	}

	public void off() {
		System.out.println(description + " ceiling fan is off");
	}

}
