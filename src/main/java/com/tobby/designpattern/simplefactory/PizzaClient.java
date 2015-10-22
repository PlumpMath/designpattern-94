package com.tobby.designpattern.simplefactory;

public class PizzaClient {

	public static void main(String[] args) {
		SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(pizzaFactory);
		Pizza pizza = store.orderPizza("pepperoni");
		System.out.println(pizza.getName());
	}

}
