package factory.factoryMethod;

import factory.simpleFactory.Pizza;

public class LondonCheesePizza extends Pizza {

	public LondonCheesePizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
		System.out.println("The London's cheese pizza is being prepared.");
	}

}
