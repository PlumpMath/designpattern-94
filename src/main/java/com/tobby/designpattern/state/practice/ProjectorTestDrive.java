package com.tobby.designpattern.state.practice;

public class ProjectorTestDrive {
	
	public static void main(String[] args) {
		Projector projector = new Projector();
		
		projector.turnOff();
		projector.turnOn();
		
		projector.turnOn();
		projector.turnOff();
		
		projector.turnOff();
	}

}
