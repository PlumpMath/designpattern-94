package com.tobby.designpattern.strategy.flybehavior.impl;

import com.tobby.designpattern.strategy.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly...");
	}

}
