package com.tobby.designpattern.strategy.flybehavior.impl;

import com.tobby.designpattern.strategy.flybehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with wings...");
	}

}
