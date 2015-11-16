package com.tobby.designpattern.proxy.monitor;

import com.tobby.designpattern.proxy.remote.GumballMachineRemote;

public class GumballMachineMonitor {

	GumballMachineRemote gumballMachine;

	public GumballMachineMonitor(GumballMachineRemote gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	void report() {
		try {
			System.out.println("Gumball Machine : " + gumballMachine.getLocation());
			System.out.println("Gumball inventory : " + gumballMachine.getCount());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
