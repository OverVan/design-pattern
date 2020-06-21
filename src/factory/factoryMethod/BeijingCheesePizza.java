package factory.factoryMethod;

import factory.simpleFactory.Pizza;

public class BeijingCheesePizza extends Pizza {

	public BeijingCheesePizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
		System.out.println("The Beijing's cheese pizza is being prepared.");
	}

}
