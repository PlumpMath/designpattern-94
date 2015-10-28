package com.tobby.designpattern.facade;

public class DvdPlayer {

	private String movie;

	public void on() {
		System.out.println("Top-O-Line DVD player on");
	}

	public void play(String movie) {
		System.out.println("Top-O-Line Dvd player playing \"" + movie  + "\"");
		this.movie = movie;
	}

	public void stop() {
		System.out.println("Top-O-Line Dvd player stopped \"" + movie + "\"");
	}

	public void eject() {
		System.out.println("Top-O-Line Dvd player eject");
	}

	public void off() {
		System.out.println("Top-O-Line Dvd player off");
	}

}
