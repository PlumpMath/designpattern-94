package com.tobby.designpattern.templatemethod;

public class Duck implements Comparable<Duck> {

	String name;

	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Duck duck) {
		if (this.weight < duck.weight) {
			return -1;
		} else if (this.weight == duck.weight) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name + " weights " + weight;
	}

}
