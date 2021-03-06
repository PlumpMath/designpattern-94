package com.tobby.designpattern.singleton;

public class ChocolateBoiler {

	private static ChocolateBoiler instance;

	private String state;

	private ChocolateBoiler() {
		
	}

	public static ChocolateBoiler getInstance() {
		if (instance == null) {
			synchronized (ChocolateBoiler.class) {
				if (instance == null) {
					instance = new ChocolateBoiler();
				}
			}
		}
		return instance;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
