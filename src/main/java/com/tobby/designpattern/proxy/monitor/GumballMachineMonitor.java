package com.tobby.designpattern.proxy.monitor;

public class GumballMachineMonitor {

	GumballMachine gumballMachine;

	public GumballMachineMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	void report() {
		System.out.println("Gumball Machine : " + gumballMachine.getLocation());
		System.out.println("Gumball inventory : " + gumballMachine.getCount());
	}

}
