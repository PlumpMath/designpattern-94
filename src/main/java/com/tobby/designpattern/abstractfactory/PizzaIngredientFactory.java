package com.tobby.designpattern.abstractfactory;

public interface PizzaIngredientFactory {

	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggie[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClams();

}
