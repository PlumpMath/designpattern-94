package com.tobby.designpattern.singleton;

public class ChocolateBoiler {

	private static ChocolateBoiler instance = new ChocolateBoiler();

	private String state;

	private ChocolateBoiler() {
		
	}

	public static ChocolateBoiler getInstance() {
		return instance;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
