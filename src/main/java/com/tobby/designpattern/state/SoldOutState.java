package com.tobby.designpattern.state;

public class SoldOutState implements State {

	GumballMachine gumBallMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumBallMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't insert a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there is no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumballs dispensed");
	}

}
