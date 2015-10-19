package com.tobby.designpattern.strategy.quackbehavior.impl;

import com.tobby.designpattern.strategy.quackbehavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
