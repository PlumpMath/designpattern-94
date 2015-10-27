package com.tobby.designpattern.commandpattern;

public class GarageDoor {

	private String description;

	public GarageDoor(String description) {
		this.description = description;
	}

	public void open() {
		System.out.println(description + " garage Door is Open");
	}

	public void close() {
		System.out.println(description + " garage Door is close");
	}

}
