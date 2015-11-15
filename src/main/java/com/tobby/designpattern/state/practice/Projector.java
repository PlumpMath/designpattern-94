package com.tobby.designpattern.state.practice;

public class Projector {
	
	State turnOnState;
	State turnOffState;
	
	State state;
	
	public Projector() {
		turnOnState = new TurnOnState(this);
		turnOffState = new TurnOffState(this);
		state = turnOffState;
	}
	
	void turnOn() {
		state.turnOn();
	}
	
	void turnOff() {
		state.turnOff();
	}
	
	State getTurnOnState() {
		return turnOnState;
	}
	
	State getTurnOffState() {
		return turnOffState;
	}

	void setState(State state) {
		this.state = state;
	}
}
