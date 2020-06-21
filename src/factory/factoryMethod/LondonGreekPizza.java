package factory.factoryMethod;

import factory.simpleFactory.Pizza;

public class LondonGreekPizza extends Pizza {

	public LondonGreekPizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
		System.out.println("The London's Greek pizza is being prepared.");
	}

}
