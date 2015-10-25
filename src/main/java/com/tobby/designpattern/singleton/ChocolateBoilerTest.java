package com.tobby.designpattern.singleton;

public class ChocolateBoilerTest {

	public static void main(String[] args) {
		ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler1.setState("I am full");
		System.out.println(boiler2.getState());
	}

}
