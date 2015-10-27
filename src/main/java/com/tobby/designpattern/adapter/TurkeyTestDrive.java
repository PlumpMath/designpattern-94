package com.tobby.designpattern.adapter;

public class TurkeyTestDrive {

	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);

		System.out.println("The duck says...");
		duck.quack();
		duck.fly();

		System.out.println("\nThe turkey says...");
		testTurkey(turkey);

		System.out.println("\nThe DuckAdapter says...");
		testTurkey(duckAdapter);
	}

	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

}
