package com.tobby.designpattern.state.practice;

public class TurnOnState implements State {
	
	Projector protector;
	
	public TurnOnState(Projector projector) {
		this.protector = projector;
	}

	@Override
	public void turnOn() {
		System.out.println("Projector already turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Projector turned off");
		protector.setState(protector.getTurnOffState());
	}

}
