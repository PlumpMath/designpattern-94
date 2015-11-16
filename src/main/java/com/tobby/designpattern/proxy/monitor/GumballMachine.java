package com.tobby.designpattern.proxy.monitor;

public class GumballMachine {

	String location;
	int count;

	public GumballMachine(String location, int count) {
		this.location = location;
		this.count = count;
	}

	int getCount() {
		return count;
	}

	String getLocation() {
		return location;
	}

}
