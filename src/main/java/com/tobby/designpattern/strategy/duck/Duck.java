package com.tobby.designpattern.strategy.duck;

import com.tobby.designpattern.strategy.flybehavior.FlyBehavior;
import com.tobby.designpattern.strategy.quackbehavior.QuackBehavior;

public abstract class Duck {

	public FlyBehavior flyBehavior;

	public QuackBehavior quackBehavior;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
