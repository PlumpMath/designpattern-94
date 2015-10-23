package com.tobby.designpattern.abstractfactory;

public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println("I get one Pizza : " + pizza.getName());
	}

}
