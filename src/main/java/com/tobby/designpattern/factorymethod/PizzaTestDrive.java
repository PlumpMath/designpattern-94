package com.tobby.designpattern.factorymethod;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		Pizza pizza2 = chicagoPizzaStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza2.getName() + "\n");
	}

}
