package com.tobby.designpattern.proxy.remote;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		try {
			String location = "three";
			int port = 1099;
			gumballMachine = new GumballMachine(location, 10);
			//LocateRegistry.createRegistry(port);
			Naming.bind(location, gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
