package com.tobby.designpattern.state.practice;

public class TurnOffState implements State {
	
	Projector projector;
	
	public TurnOffState(Projector projector) {
		this.projector = projector;
	}

	@Override
	public void turnOn() {
		System.out.println("Projector turned on...");
		projector.setState(projector.getTurnOnState());
	}

	@Override
	public void turnOff() {
		System.out.println("Projector already turned off");
	}

}
