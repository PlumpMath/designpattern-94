package com.tobby.designpattern.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffe";
	}

	@Override
	public double cost() {
		return .99;
	}

}
