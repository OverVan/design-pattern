package factory.factoryMethod;

import factory.simpleFactory.Pizza;

public class BeijingGreekPizza extends Pizza {

	public BeijingGreekPizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
		System.out.println("The Beijing's Greek pizza is being prepared.");
	}

}
