package com.tobby.designpattern.state;

public class GumballMachine {

	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot");
		if (count > 0) {
			count -= 1;
		}
	}

	void insertQuarter() {
		state.insertQuarter();
	}

	void ejectQuarter() {
		state.ejectQuarter();
	}

	void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	int getCount() {
		return count;
	}

	State getState() {
		return state;
	}

	State getNoQuarterState() {
		return noQuarterState;
	}

	State getHasQuarterState() {
		return hasQuarterState;
	}

	State getSoldState() {
		return soldState;
	}

	State getSoldOutState() {
		return soldOutState;
	}

	State getWinnerState() {
		return winnerState;
	}
	
	@Override
	public String toString() {
		String result = "Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\n" + "Inventory: " + count
				+ " gumballs\n";
		if (state == hasQuarterState) {
			result += "You inserted a quarter";
		} else if (state == noQuarterState) {
			result += "Machine is waiting for quarter";
		} else if (state == soldState) {
			result += "Machine is solding gumball";
		} else if (state == soldOutState) {
			result += "Machine is sold out";
		}else if (state == winnerState) {
			result += "Machine is solding gumball";
		}
		return result + "\n";
	}
}
