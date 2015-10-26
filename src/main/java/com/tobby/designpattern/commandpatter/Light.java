package com.tobby.designpattern.commandpatter;

public class Light {

	private String description;

	public Light(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " light is on...");
	}

	public void off() {
		System.out.println(description + " light is off...");
	}

}
