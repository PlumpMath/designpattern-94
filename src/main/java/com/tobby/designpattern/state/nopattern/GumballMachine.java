package com.tobby.designpattern.state.nopattern;

import java.util.Random;

public class GumballMachine {
	
	Random randomWinner = new Random(System.currentTimeMillis());

	final static int SOLD_OUT = 0;

	final static int NO_QUARTER = 1;

	final static int HAS_QUARTER = 2;

	final static int SOLD = 3;

	final static int WINNER = 4;

	int state = SOLD_OUT;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		} else if (state == WINNER) {
			System.out.println("Please wait, we're already giving you gumballs");
		}
	}

	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			state = NO_QUARTER;
			System.out.println("Quarter returned");
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == WINNER) {
			System.out.println("Sorry, you already turned the crank");
		}
	}

	public void turnCrank() {
		if (state == HAS_QUARTER) {
			state = SOLD;
			System.out.println("You turned...");
			dispense();
		} else if (state == NO_QUARTER) {
			System.out.println("You turned but there is no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there is no gumballs");
		} else if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball");
		} else if (state == WINNER) {
			System.out.println("Turning twice doesn't get you another gumball");
		}
	}

	private void dispense() {
		int winner = randomWinner.nextInt(10);
		if (winner == 0 && count > 1) {
			count -= 1;
			System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		} else {
			System.out.println("A gumball comes rolling out the slot");
		}
		count -= 1;
		if (count == 0) {
			System.out.println("Opps, out of gumballs");
			state = SOLD_OUT;
		} else {
			state = NO_QUARTER;
		}
	}

	@Override
	public String toString() {
		String result = "Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\n" + "Inventory: " + count
				+ " gumballs\n";
		if (state == HAS_QUARTER) {
			result += "You inserted a quarter";
		} else if (state == NO_QUARTER) {
			result += "Machine is waiting for quarter";
		} else if (state == SOLD) {
			result += "Machine is solding gumball";
		} else if (state == SOLD_OUT) {
			result += "Machine is sold out";
		}else if (state == WINNER) {
			result += "Machine is solding gumball";
		}
		return result + "\n";
	}

}
