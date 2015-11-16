package com.tobby.designpattern.proxy.monitor;

import java.rmi.Naming;

import com.tobby.designpattern.proxy.remote.GumballMachineRemote;

public class GumballMachineTestDrive {
	
	public static void main(String[] args) {
		String[] location = {"rmi://localhost/one", 
				"rmi://localhost/two",
				"rmi://localhost/three"};
		GumballMachineMonitor[] monitors = new GumballMachineMonitor[location.length];
		for (int i = 0; i < location.length; i ++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote)Naming.lookup(location[i]);
				monitors[i] = new GumballMachineMonitor(machine);
				System.out.println(monitors[i]);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for (int i = 0; i < monitors.length; i ++) {
			monitors[i].report();
		}
	}

}
