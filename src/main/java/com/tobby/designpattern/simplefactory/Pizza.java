package com.tobby.designpattern.simplefactory;

public abstract class Pizza {

	void prepare() {
		System.out.println("Preparing " + getName());
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official box");
	}

	public abstract String getName();

}
