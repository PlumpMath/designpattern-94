package com.tobby.designpattern.strategy;

import com.tobby.designpattern.strategy.duck.Duck;
import com.tobby.designpattern.strategy.duck.impl.MallardDuck;
import com.tobby.designpattern.strategy.duck.impl.ModelDuck;
import com.tobby.designpattern.strategy.flybehavior.impl.FlyRocketPowered;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
