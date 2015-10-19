package com.tobby.designpattern.strategy.flybehavior.impl;

import com.tobby.designpattern.strategy.flybehavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
