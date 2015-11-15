package com.tobby.designpattern.state;

public class WinnerState implements State {
	
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we are already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice dosen't get you another gumball");
	}

	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get tow gumballs for you quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Opps, out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
