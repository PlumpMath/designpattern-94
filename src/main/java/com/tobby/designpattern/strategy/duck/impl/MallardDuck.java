package com.tobby.designpattern.strategy.duck.impl;

import com.tobby.designpattern.strategy.duck.Duck;
import com.tobby.designpattern.strategy.flybehavior.impl.FlyWithWings;
import com.tobby.designpattern.strategy.quackbehavior.impl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}

}
