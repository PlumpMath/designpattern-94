package com.tobby.designpattern.templatemethod;

public class BeverageTestDrive {

	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffe = new Coffee();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffe...");
		coffe.prepareRecipe();
	}
}
