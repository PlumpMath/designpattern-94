package com.tobby.designpattern.commandpattern;

public class Stereo {

	private String description;

	public Stereo(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " stereo is on");
	}

	public void setCD() {
		System.out.println(description + " stereo is set for CD input");
	}

	public void setVolume(int volume) {
		System.out.println(description + " stereo volume is set to " + volume);
	}

	public void off() {
		System.out.println(description + " stereo is off");
	}

}
