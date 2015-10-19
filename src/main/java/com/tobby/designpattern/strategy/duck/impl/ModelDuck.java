package com.tobby.designpattern.strategy.duck.impl;

import com.tobby.designpattern.strategy.duck.Duck;
import com.tobby.designpattern.strategy.flybehavior.impl.FlyNoWay;
import com.tobby.designpattern.strategy.quackbehavior.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
